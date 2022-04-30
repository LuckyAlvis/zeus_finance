package com.dai.zeus.finance.server.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dai.shenzhen.zeus.common.core.model.BaseResponse;
import com.dai.zeus.finance.api.feign.IUserRemoteService;
import com.dai.zeus.finance.api.pojo.entity.User;
import com.dai.zeus.finance.api.pojo.request.UserReq;
import com.dai.zeus.finance.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController implements IUserRemoteService {

    @Autowired
    private UserService userService;

    @Override
    public BaseResponse<Page<User>> getUsers(UserReq req) {
        return BaseResponse.ok(userService.page(new Page<>(req.getCurrent(), req.getSize())));
    }

    @Override
    public BaseResponse<User> getUserById(Long id) {
        return BaseResponse.ok(userService.getById(id));
    }
}
