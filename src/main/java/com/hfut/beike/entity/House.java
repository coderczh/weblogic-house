package com.hfut.beike.entity;

import lombok.Data;

/**
 * @author Chenzh
 */
@Data
public class House {
    private Integer id;
    private String name;
    private String state;
    private String model;
    private String address;
    private String type;
    private String area;
    private Double price;
    private String image;
}
