package com.lwh147.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description: BeanPostProcessor 容器级后处理器接口实现
 * @author: lwh
 * @create: 2021/9/22 15:10
 **/
@Component
@Slf4j(topic = "Bean生命周期")
public class MyBeanPostProcessor implements BeanPostProcessor {
    private final String name = "helloImpl";

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (name.equals(beanName)) {
            log.info("MyBeanPostProcessor - postProcessBeforeInitialization()");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (name.equals(beanName)) {
            log.info("MyBeanPostProcessor - postProcessAfterInitialization()");
        }
        return bean;
    }
}
