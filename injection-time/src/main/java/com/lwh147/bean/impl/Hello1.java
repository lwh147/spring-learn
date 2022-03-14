package com.lwh147.bean.impl;

import com.lwh147.bean.Hello;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @description: 用作属性注入的Bean
 * @author: lwh
 * @create: 2021/9/17 11:01
 **/
@Slf4j(topic = "Bean注入流程")
@Data
@Component("hello1")
public class Hello1 implements Hello {
    private String name = "hello1";

    public Hello1() {
        log.info("{} - Constructor", name);
    }
}
