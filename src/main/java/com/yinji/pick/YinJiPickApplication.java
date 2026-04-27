package com.yinji.pick;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.yinji.pick.mapper")
@EnableRabbit
@SpringBootApplication
public class YinJiPickApplication {
    //
    public static void main(String[] args) {
        SpringApplication.run(YinJiPickApplication.class, args);
    }

}





