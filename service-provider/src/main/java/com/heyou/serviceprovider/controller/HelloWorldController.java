package com.heyou.serviceprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019/10/28 15:38
 * <p>
 *
 * @author heyou
 * @version 1.0.0
 */
@RestController
public class HelloWorldController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi " + name + ", i am from port: " + port;
    }
}
