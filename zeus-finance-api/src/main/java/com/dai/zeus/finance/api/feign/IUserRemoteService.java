package com.dai.zeus.finance.api.feign;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dai.shenzhen.zeus.common.core.model.BaseResponse;
import com.dai.zeus.finance.api.pojo.request.UserReq;
import com.dai.zeus.finance.api.pojo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface IUserRemoteService {

    @PostMapping("/user")
    BaseResponse<Page<User>> getUsers(@RequestBody UserReq req);

    @GetMapping("/user/{id}")
    BaseResponse<User> getUserById(@PathVariable Long id);
}
