package com.dai.zeus.finance.server;

import com.dai.zeus.finance.server.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisPlusServiceTest {

    @Autowired
    private UserService userService;

    @Test
    // SELECT COUNT( * ) FROM user
    public void testGetCount() {
        long count = userService.count();
        System.out.println("count: " + count);
    }

//    @Test
//    public void testSave() {
//        List<User> userList = new ArrayList<>();
//        for (int i = 1; i <= 10; i++) {
//            User user = new User();
//            user.setName("new" + i);
//            user.setEmail("test@qq.com");
//            user.setStatus(0);
//            userList.add(user);
//        }
//        boolean result = userService.saveBatch(userList);
//        System.out.println("result: " + result);
//}
}
