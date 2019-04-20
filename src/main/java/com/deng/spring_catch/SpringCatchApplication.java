package com.deng.spring_catch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("com.deng")
@SpringBootApplication
@EnableCaching
public class SpringCatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCatchApplication.class, args);
    }
}
