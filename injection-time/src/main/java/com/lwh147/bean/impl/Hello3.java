package com.lwh147.bean.impl;

import com.lwh147.bean.Hello;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @description: 用作set注入的Bean
 * @author: lwh
 * @create: 2021/9/17 11:09
 **/
@Slf4j(topic = "Bean注入流程")
@Data
@Component("hello3")
public class Hello3 implements Hello {
    private String name = "hello3";

    public Hello3() {
        log.info("{} - Constructor", name);
    }
}
