package com.hfut.beike.service;

import com.hfut.beike.entity.House;
import com.hfut.beike.mapper.HouseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Chenzh
 */
@Service
public class HouseService {
    @Resource
    HouseMapper houseMapper;

    public Boolean preserveHouse(House house) {
        return houseMapper.saveHouse(house) == 1;
    }
}
