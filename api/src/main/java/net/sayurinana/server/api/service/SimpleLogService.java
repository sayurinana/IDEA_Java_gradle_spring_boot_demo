package net.sayurinana.server.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import net.sayurinana.common.utils.PageUtils;
import net.sayurinana.server.api.entity.SimpleLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author sayurinana
 * @email sayurinana@163.com
 * @date 2023-12-25 10:37:18
 */
public interface SimpleLogService extends IService<SimpleLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

