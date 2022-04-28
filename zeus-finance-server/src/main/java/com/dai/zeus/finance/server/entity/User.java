package com.dai.zeus.finance.server.entity;

import lombok.Data;

@Data
//方式一: 表和实体映射关系
//@TableName("user")
public class User {
    private Long id;
    private String name;
    private String password;
    private String email;
    private Integer status;
    private Boolean isDelete;
}
