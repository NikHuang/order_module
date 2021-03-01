package com.hhq.order.feign.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Payment {

    private String id;

    private String name;

    private String briefName;

    private Date createTime;

    private Date updateTime;




}
