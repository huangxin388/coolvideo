package com.bupt.coolvideo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huang xin
 * @Date 2020/1/2 21:55
 * @Version 1.0
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String hello() {
        return "hello ~~~  I'm just a test controller";
    }
}
