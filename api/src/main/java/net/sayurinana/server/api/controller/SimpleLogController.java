package net.sayurinana.server.api.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.sayurinana.server.api.entity.SimpleLogEntity;
import net.sayurinana.server.api.service.SimpleLogService;
import net.sayurinana.common.utils.PageUtils;
import net.sayurinana.common.utils.R;



/**
 * 
 *
 * @author sayurinana
 * @email sayurinana@163.com
 * @date 2023-12-25 10:37:18
 */
@RestController
@RequestMapping("api/simplelog")
public class SimpleLogController {
    @Autowired
    private SimpleLogService simpleLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("api:simplelog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = simpleLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("api:simplelog:info")
    public R info(@PathVariable("id") Integer id){
		SimpleLogEntity simpleLog = simpleLogService.getById(id);

        return R.ok().put("simpleLog", simpleLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("api:simplelog:save")
    public R save(@RequestBody SimpleLogEntity simpleLog){
		simpleLogService.save(simpleLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("api:simplelog:update")
    public R update(@RequestBody SimpleLogEntity simpleLog){
		simpleLogService.updateById(simpleLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("api:simplelog:delete")
    public R delete(@RequestBody Integer[] ids){
		simpleLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
