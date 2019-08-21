package com.java.zd.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Liushun
 * @date Created in 2019/8/16 21:51
 * @description
 */
@SpringBootApplication(scanBasePackages = "com.java.zd.provider.*")
@MapperScan("com.java.zd.provider.mapper")
public class Provider2Start {

    public static void main(String[] args){
        SpringApplication.run(Provider2Start.class);
    }

}
