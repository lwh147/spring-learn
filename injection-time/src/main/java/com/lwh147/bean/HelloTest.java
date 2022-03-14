package com.lwh147.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @description: 测试类
 * @author: lwh
 * @create: 2021/9/17 11:11
 **/
@Slf4j(topic = "Bean注入流程")
@Component
public class HelloTest {
    public String name = "helloTest";

    /**
     * 属性注入
     **/
    @Resource(name = "hello1")
    private Hello hello;

    /**
     * 构造器注入
     **/
    @Autowired
    public HelloTest(@Qualifier("hello2") Hello hello) {
        this.hello = hello;
        log.info("{} - Constructor - hello={}", name, this.hello.toString());
    }

    /**
     * set注入
     **/
    @Resource
    public void setHello(Hello hello3) {
        this.hello = hello3;
        log.info("{} - setHello() - hello={}", name, this.hello.toString());
    }

    /**
     * 对象初始化
     **/
    @PostConstruct
    public void init() {
        log.info("{} - init() - hello={}", name, hello.toString());
    }

    /**
     * Bean准备好后调用
     **/
    public void getHello() {
        log.info("{} - getHello() - hello={}", name, this.hello.toString());
    }
}
