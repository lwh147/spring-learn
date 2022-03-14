package com.lwh147.bean.impl;

import com.lwh147.bean.Hello;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @description: HelloBean
 * @author: lwh
 * @create: 2021/9/22 14:50
 **/
@Slf4j(topic = "Bean生命周期")
public class HelloImpl implements Hello, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private final String name = "helloImpl";

    /**
     * Bean级生命周期接口BeanFactoryAware实现
     *
     * @param beanFactory
     **/
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("BeanFactoryAware - setBeanFactory()");
    }

    /**
     * Bean级生命周期接口BeanNameAware实现
     *
     * @param s
     **/
    @Override
    public void setBeanName(String s) {
        log.info("BeanNameAware - setBeanName()");
    }

    /**
     * Bean级生命周期接口DisposableBean实现
     **/
    @Override
    public void destroy() throws Exception {
        log.info("DisposableBean - destroy()");
    }

    /**
     * Bean级生命周期接口InitializingBean实现
     **/
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("InitializingBean - afterPropertiesSet()");
    }

    /**
     * Bean级生命周期接口ApplicationContextAware实现
     **/
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("ApplicationContextAware - setApplicationContext()");
    }

    /**
     * Bean自身后初始化方法，使用@PostConstruct注解指定
     **/
    @PostConstruct
    public void postConstruct() {
        log.info("{} - postConstruct()", name);
    }

    /**
     * Bean自身前置销毁方法，使用@PreDestroy注解指定
     **/
    @PreDestroy
    public void preDestroy() {
        log.info("{} - preDestroy()", name);
    }

    /**
     * Bean自身后初始化方法，使用@Bean注解指定，与XML配置方式等价
     **/
    public void init2() {
        log.info("{} - init-method", name);
    }

    /**
     * Bean自身前置销毁方法，使用@Bean注解指定，与XML配置方式等价
     **/
    public void destroy2() {
        log.info("{} - destroy-method", name);
    }
}

