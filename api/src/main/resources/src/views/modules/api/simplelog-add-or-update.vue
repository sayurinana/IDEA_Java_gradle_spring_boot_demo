<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="标题字段，是最大长度为20的字符串，默认值为空字符串" prop="title">
      <el-input v-model="dataForm.title" placeholder="标题字段，是最大长度为20的字符串，默认值为空字符串"></el-input>
    </el-form-item>
    <el-form-item label="描述字段，内容可以很长很长很长" prop="desc">
      <el-input v-model="dataForm.desc" placeholder="描述字段，内容可以很长很长很长"></el-input>
    </el-form-item>
    <el-form-item label="创建记录时的时间戳" prop="createTime">
      <el-input v-model="dataForm.createTime" placeholder="创建记录时的时间戳"></el-input>
    </el-form-item>
    <el-form-item label="被修改时的时间戳" prop="updateTime">
      <el-input v-model="dataForm.updateTime" placeholder="被修改时的时间戳"></el-input>
    </el-form-item>
    </el-form>
    <span slot="footer" class="dialog-footer">
      <el-button @click="visible = false">取消</el-button>
      <el-button type="primary" @click="dataFormSubmit()">确定</el-button>
    </span>
  </el-dialog>
</template>

<script>
  export default {
    data () {
      return {
        visible: false,
        dataForm: {
          id: 0,
          title: '',
          desc: '',
          createTime: '',
          updateTime: ''
        },
        dataRule: {
          title: [
            { required: true, message: '标题字段，是最大长度为20的字符串，默认值为空字符串不能为空', trigger: 'blur' }
          ],
          desc: [
            { required: true, message: '描述字段，内容可以很长很长很长不能为空', trigger: 'blur' }
          ],
          createTime: [
            { required: true, message: '创建记录时的时间戳不能为空', trigger: 'blur' }
          ],
          updateTime: [
            { required: true, message: '被修改时的时间戳不能为空', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      init (id) {
        this.dataForm.id = id || 0
        this.visible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].resetFields()
          if (this.dataForm.id) {
            this.$http({
              url: this.$http.adornUrl(`/api/simplelog/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.title = data.simpleLog.title
                this.dataForm.desc = data.simpleLog.desc
                this.dataForm.createTime = data.simpleLog.createTime
                this.dataForm.updateTime = data.simpleLog.updateTime
              }
            })
          }
        })
      },
      // 表单提交
      dataFormSubmit () {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            this.$http({
              url: this.$http.adornUrl(`/api/simplelog/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'title': this.dataForm.title,
                'desc': this.dataForm.desc,
                'createTime': this.dataForm.createTime,
                'updateTime': this.dataForm.updateTime
              })
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.$message({
                  message: '操作成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.visible = false
                    this.$emit('refreshDataList')
                  }
                })
              } else {
                this.$message.error(data.msg)
              }
            })
          }
        })
      }
    }
  }
</script>
