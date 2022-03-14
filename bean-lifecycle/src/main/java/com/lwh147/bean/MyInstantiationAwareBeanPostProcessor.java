package com.lwh147.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description: InstantiationAwareBeanPostProcessor 容器级后处理器接口实现
 * @author: lwh
 * @create: 2021/9/17 11:30
 **/
@Component
@Slf4j(topic = "Bean生命周期")
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    private final String name = "helloImpl";

    /**
     * 实例化之前调用，可以自定义实例化Bean
     *
     * @param beanClass
     * @param beanName
     * @return Object 自定义实例化的Bean对象，不为null则会被使用
     **/
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (name.equals(beanName)) {
            log.info("MyInstantiationAwareBeanPostProcessor - postProcessBeforeInstantiation()");
        }
        return null;
    }

    /**
     * 实例化之后，属性填充前调用
     *
     * @param bean
     * @param beanName
     * @return
     **/
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (name.equals(beanName)) {
            log.info("MyInstantiationAwareBeanPostProcessor - postProcessAfterInstantiation()");
        }
        return true;
    }

    /**
     * 实例化之后，属性填充前，在postProcessAfterInstantiation方法后调用
     *
     * @param pvs
     * @param bean
     * @param beanName
     * @return
     **/
    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if (name.equals(beanName)) {
            log.info("MyInstantiationAwareBeanPostProcessor - postProcessProperties()");
        }
        return pvs;
    }
}
