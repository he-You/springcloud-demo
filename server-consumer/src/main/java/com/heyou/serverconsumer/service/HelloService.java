package com.heyou.serverconsumer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019/10/29 13:39
 * <p>
 *
 * @author heyou
 * @version 1.0.0
 */
@Service
public class HelloService {
    @Resource
    RestTemplate restTemplate;

    public String hiService(String name)
    {
        return restTemplate.getForObject("http://SERVICE-HELLO/hi?name=" + name, String.class);
    }
}
