package com.java.zd.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Liushun
 * @date Created in 2019/8/16 21:28
 * @description 消费者启动类
 */
@SpringBootApplication(scanBasePackages = "com.java.zd.consumer.*")
public class ConsumerStart {

    public static void main(String[] args){
        SpringApplication.run(ConsumerStart.class);
    }

}
