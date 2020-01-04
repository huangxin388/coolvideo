package com.bupt.service.impl;

import com.bupt.dao.entity.Bgm;
import com.bupt.dao.mapper.BgmMapper;
import com.bupt.service.BgmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author huang xin
 * @Date 2020/1/4 21:56
 * @Version 1.0
 */
@Service
public class BgmInfoServiceImpl implements BgmService {

    @Autowired
    private BgmMapper bgmMapper;

    @Override
    public List<Bgm> getBgmInfo() {
        List<Bgm> bgmList = bgmMapper.selectByExample(null);
        return bgmList;
    }
}
