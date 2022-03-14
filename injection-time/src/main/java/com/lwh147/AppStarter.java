package com.lwh147;

import com.lwh147.bean.HelloTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @description: 启动类
 * @author: lwh
 * @create: 2021/9/17 10:58
 **/
@SpringBootApplication
@Slf4j
public class AppStarter {
    @Resource
    private HelloTest helloTest;

    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class);
    }

    /**
     * 打印helloTest的最终注入结果
     **/
    @PostConstruct
    public void test() {
        helloTest.getHello();
    }
}
