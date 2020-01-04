package com.bupt.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huang xin
 * @Date 2020/1/3 15:32
 * @Version 1.0
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "spring boot test~~~";
    }
}
