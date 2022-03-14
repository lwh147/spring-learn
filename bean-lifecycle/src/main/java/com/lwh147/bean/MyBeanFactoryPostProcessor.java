package com.lwh147.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @description: 工厂后处理器接口实现
 * @author: lwh
 * @create: 2021/9/22 15:18
 **/
@Component
@Slf4j(topic = "Bean生命周期")
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    /**
     * 工厂后处理器方法，容器启动后调用，可以直接对工厂中的可配置Bean元数据进行操作
     *
     * @param configurableListableBeanFactory
     * @return
     **/
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        log.info("MyBeanFactoryPostProcessor - postProcessBeanFactory()");
    }
}
