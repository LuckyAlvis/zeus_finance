package com.dai.zeus.finance.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dai.zeus.finance.server.entity.User;
import org.apache.ibatis.annotations.MapKey;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据id查询用户信息为map集合
     *
     * @param id 主键
     * @return 查询结果
     */
    @MapKey("email")
    // 多条记录封装一个map：Map<,User>:键是这条记录的逐渐，值是记录封装后的Java对象
    // 告诉mybatis封装这个map的时候使用哪个属性作为map的key（key为数据库表字段）
    Map<String, Object> selectMapById(Long id);
}
