package net.sayurinana.server.api.dao;

import net.sayurinana.server.api.entity.SimpleLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author sayurinana
 * @email sayurinana@163.com
 * @date 2023-12-25 10:37:18
 */
@Mapper
public interface SimpleLogDao extends BaseMapper<SimpleLogEntity> {
	
}
