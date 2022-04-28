package com.dai.zeus.finance.server;

import com.dai.zeus.finance.server.entity.User;
import com.dai.zeus.finance.server.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MybatisPlusTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("戴倚凡1");
        int result = userMapper.insert(user);
        System.out.println("result: " + result);
        // 根据雪花算法生成的id
        System.out.println("userId: " + user.getId());
    }

    @Test
    public void testDeleteById() {
        int result = userMapper.deleteById(1519804048992276481L);
        System.out.println("result: " + result);
    }

    @Test
    public void testDeleteByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "戴倚凡1");
        map.put("status", 1);
        int result = userMapper.deleteByMap(map);
        System.out.println("result: " + result);
    }

    @Test
    public void testDeleteBatchIds() {
        List<Long> list = Arrays.asList(1L, 2L, 3L);
        int result = userMapper.deleteBatchIds(list);
        System.out.println("result: " + result);

    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(4L);
        user.setEmail("ivan.dai@qq.com");
        int result = userMapper.updateById(user);
        System.out.println("result: " + result);
    }

    @Test
    public void testSelect() {
        User user = userMapper.selectById(6L);
        System.out.println(user);
    }

    @Test
    public void testSelectBatchIds() {
        List<Long> list = Arrays.asList(4L, 5L, 6L);
        List<User> users = userMapper.selectBatchIds(list);
        users.forEach(System.out::println);
    }

    @Test
    public void testSelectByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "戴倚凡5");
        map.put("email", "ivan.dai@nf-3.com");
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);
    }

    /**
     * 自定义查询
     */
    @Test
    public void testSelectByIdMapper() {
        Map<String, Object> map = userMapper.selectMapById(4L);
        System.out.println(map);

    }
}
