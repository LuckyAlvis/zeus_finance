package com.dai.zeus.finance.server;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dai.zeus.finance.server.entity.User;
import com.dai.zeus.finance.server.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisPluginsTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testPage() {
        Page<User> page = new Page<>(1, 30);
        userMapper.selectPage(page, null);
        System.out.println("page.getRecords: " + page.getRecords());
        System.out.println("page.getCurrent:" + page.getCurrent());
        System.out.println("page.getSize:" + page.getSize());
        System.out.println("page.getPages: " + page.getPages());
        System.out.println("page.getTotal:" + page.getTotal());
    }

}
