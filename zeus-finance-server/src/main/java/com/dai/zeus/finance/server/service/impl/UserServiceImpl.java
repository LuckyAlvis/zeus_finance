package com.dai.zeus.finance.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dai.zeus.finance.server.entity.User;
import com.dai.zeus.finance.server.mapper.UserMapper;
import com.dai.zeus.finance.server.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
