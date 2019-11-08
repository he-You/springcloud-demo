package com.heyou.serverconsumer.controller;

import com.heyou.serverconsumer.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019/10/29 13:37
 * <p>
 *
 * @author heyou
 * @version 1.0.0
 */
@RestController
public class HelloController {
    @Resource
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        System.out.println("test");
        return helloService.hiService(name);
    }
}
