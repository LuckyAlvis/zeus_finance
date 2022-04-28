package com.dai.zeus.finance.server.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String password;
    private String email;
    private Integer status;
    private Boolean isDelete;
}
