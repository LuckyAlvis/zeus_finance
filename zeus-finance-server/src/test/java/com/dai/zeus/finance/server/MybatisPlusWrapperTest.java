package com.dai.zeus.finance.server;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dai.zeus.finance.api.pojo.entity.User;
import com.dai.zeus.finance.server.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisPlusWrapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01() {
        // 查询用户名包含戴，邮箱信息不为null的用户信息
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.like("name", "戴")
//                .isNotNull("email");
        queryWrapper.isNull("email");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    @Test
    public void test02() {
        // 删除邮箱为null的用户
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("email");
        int result = userMapper.delete(queryWrapper);
        System.out.println("result: " + result);
    }
}
