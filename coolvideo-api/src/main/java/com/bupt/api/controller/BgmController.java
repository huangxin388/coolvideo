package com.bupt.api.controller;

import com.bupt.dao.entity.Bgm;
import com.bupt.service.BgmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author huang xin
 * @Date 2020/1/4 21:54
 * @Version 1.0
 */
@RestController
public class BgmController {

    @Autowired
    private BgmService bgmService;

    @GetMapping("/getBgmInfo")
    public List<Bgm> getBgmInfo() {
        List<Bgm> bgmList = bgmService.getBgmInfo();
        return bgmList;
    }
}
