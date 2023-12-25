package net.sayurinana.server.api.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author sayurinana
 * @email sayurinana@163.com
 * @date 2023-12-25 10:37:18
 */
@Data
@TableName("simple_log")
public class SimpleLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer id;
	/**
	 * 标题字段，是最大长度为20的字符串，默认值为空字符串
	 */
	private String title;
	/**
	 * 描述字段，内容可以很长很长很长
	 */
	private String description;
	/**
	 * 创建记录时的时间戳
	 */
	private String createTime;
	/**
	 * 被修改时的时间戳
	 */
	private String updateTime;

}
