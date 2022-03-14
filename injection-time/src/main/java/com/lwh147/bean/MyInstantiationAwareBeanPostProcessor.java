package com.lwh147.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description: 打印Bean的生命周期
 * @author: lwh
 * @create: 2021/9/17 11:30
 **/
@Component
@Slf4j(topic = "Bean生命周期")
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("helloTest".equals(beanName)) {
            log.info("{} - 实例化前", beanName);
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("helloTest".equals(beanName)) {
            log.info("{} - 实例化后", beanName);
        }
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if ("helloTest".equals(beanName)) {
            log.info("{} - 填充属性前", beanName);
        }
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("helloTest".equals(beanName)) {
            log.info("{} - 初始化前", beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("helloTest".equals(beanName)) {
            log.info("{} - 初始化后", beanName);
        }
        return bean;
    }
}
