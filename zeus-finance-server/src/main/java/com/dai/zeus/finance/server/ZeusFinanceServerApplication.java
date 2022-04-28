package com.dai.zeus.finance.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dai.zeus.finance.server.mapper")
public class ZeusFinanceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeusFinanceServerApplication.class, args);
    }

}
