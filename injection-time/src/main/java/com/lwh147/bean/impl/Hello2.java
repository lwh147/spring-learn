package com.lwh147.bean.impl;

import com.lwh147.bean.Hello;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @description: 用作构造器注入的Bean
 * @author: lwh
 * @create: 2021/9/17 11:05
 **/
@Slf4j(topic = "Bean注入流程")
@Data
@Component("hello2")
public class Hello2 implements Hello {
    private String name = "hello2";

    public Hello2() {
        log.info("{} - Constructor", name);
    }
}
