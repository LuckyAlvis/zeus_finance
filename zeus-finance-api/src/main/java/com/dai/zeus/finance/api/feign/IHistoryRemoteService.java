package com.dai.zeus.finance.api.feign;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dai.shenzhen.zeus.common.core.model.BaseResponse;
import com.dai.zeus.finance.api.pojo.entity.History;
import com.dai.zeus.finance.api.pojo.request.HistoryReq;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/history")
public interface IHistoryRemoteService {

    @PostMapping("/listPage")
    BaseResponse<Page<History>> getHistories(@RequestBody HistoryReq req);

    @GetMapping("/{id}")
    BaseResponse<History> getHistoryById(@PathVariable Long id);

    @PostMapping("/save")
    BaseResponse<Boolean> saveHistory(@RequestBody History history);
}
