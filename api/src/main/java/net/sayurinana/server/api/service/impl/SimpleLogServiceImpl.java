package net.sayurinana.server.api.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.sayurinana.common.utils.PageUtils;
import net.sayurinana.common.utils.Query;

import net.sayurinana.server.api.dao.SimpleLogDao;
import net.sayurinana.server.api.entity.SimpleLogEntity;
import net.sayurinana.server.api.service.SimpleLogService;


@Service("simpleLogService")
public class SimpleLogServiceImpl extends ServiceImpl<SimpleLogDao, SimpleLogEntity> implements SimpleLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SimpleLogEntity> page = this.page(
                new Query<SimpleLogEntity>().getPage(params),
                new QueryWrapper<SimpleLogEntity>()
        );

        return new PageUtils(page);
    }

}