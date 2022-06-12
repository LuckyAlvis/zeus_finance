package com.dai.zeus.finance.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dai.zeus.finance.api.pojo.entity.History;
import com.dai.zeus.finance.server.mapper.HistoryMapper;
import com.dai.zeus.finance.server.service.HistoryService;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @description 针对表【history】的数据库操作Service实现
 * @createDate 2022-05-01 16:50:55
 */
@Service
public class HistoryServiceImpl extends ServiceImpl<HistoryMapper, History>
        implements HistoryService {

}
