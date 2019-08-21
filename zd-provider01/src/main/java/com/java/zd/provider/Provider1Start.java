package com.java.zd.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Liushun
 * @date Created in 2019/8/16 21:39
 * @description 提供者1的启动类
 */
@SpringBootApplication(scanBasePackages = "com.java.zd.provider.*")
@MapperScan("com.java.zd.provider.mapper")
public class Provider1Start {

    public static void main(String[] args){
        SpringApplication.run(Provider1Start.class);
    }

}
