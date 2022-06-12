package com.dai.zeus.finance.server.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dai.shenzhen.zeus.common.core.model.BaseResponse;
import com.dai.zeus.finance.api.feign.IHistoryRemoteService;
import com.dai.zeus.finance.api.pojo.entity.History;
import com.dai.zeus.finance.api.pojo.request.HistoryReq;
import com.dai.zeus.finance.server.service.HistoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class HistoryController implements IHistoryRemoteService {

    @Autowired
    private HistoryService historyService;

    @Override
    public BaseResponse<Page<History>> getHistories(HistoryReq req) {
        QueryWrapper<History> queryWrapper = new QueryWrapper<>();
        if (req.getHistory() != null) {
            BeanUtils.copyProperties(req.getHistory(), queryWrapper);
        }
        queryWrapper.orderByDesc("gmt_create");
        return BaseResponse.ok(historyService.page(new Page<>(req.getCurrent(), req.getSize()), queryWrapper));
    }

    @Override
    public BaseResponse<History> getHistoryById(Long id) {
        return BaseResponse.ok(historyService.getById(id));
    }

    @Override
    public BaseResponse<Boolean> saveHistory(History history) {
        history.setGmtCreate(new Date());
        history.setGmtModify(new Date());
        return BaseResponse.ok(historyService.save(history));
    }
}
