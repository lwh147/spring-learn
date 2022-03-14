package com.lwh147;

import com.lwh147.bean.impl.HelloImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @description: 启动类
 * @author: lwh
 * @create: 2021/9/17 10:58
 **/
@SpringBootApplication
@Slf4j
public class AppStarter {
    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class);
    }

    @Bean(name = "helloImpl", initMethod = "init2", destroyMethod = "destroy2")
    public HelloImpl test() {
        return new HelloImpl();
    }
}
