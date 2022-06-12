package com.dai.zeus.finance.api.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
//方式一: 表和实体映射关系
@TableName("user")
public class User {
    // mbp默认规则：默认使用id字段作为主键，如果换成类似uid之类的主键，mbp将不知道哪个是主键
    // 需要通过如下注解将属性所对应的字段指定为主键
    // @TableId
    // @TableId注解的value属性用于指定主键的字段，如果表和实体的主键名不一样，需要通过value指定表主键名
    // @TableId注解的type属性用于设置主键生成策略
    // idType.ASSIGN_ID(默认) 基于雪花算法的策略生成数据id，与数据库id是否设置自增无关
    // IdType.AUTO 使用数据库的自增策略，注意，该类型需数据库设置了id自增，否则无效
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    private String password;
    private String email;
    private Integer status;
    @TableLogic
    private Boolean isDelete;
}
