package com.hfut.beike.mapper;

import com.hfut.beike.entity.House;
import org.apache.ibatis.annotations.Insert;

/**
 * @author Chenzh
 */
public interface HouseMapper {

    /**
     * 插入房源信息
     *
     * @param house 房源
     * @return 插入的结果
     */
    @Insert("INSERT INTO house(name, state, model, address, type, area, price, image) VALUES(" +
            "#{name}, #{state}, #{model}, #{address}, #{type}, #{area}, #{price}, #{image})")
    Integer saveHouse(House house);
}
