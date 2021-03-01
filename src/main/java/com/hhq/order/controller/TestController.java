package com.hhq.order.controller;

import com.alibaba.fastjson.JSONObject;
import com.hhq.common_sdk.rest.HttpClient;
import com.hhq.common_sdk.result.Result;
import com.hhq.order.feign.PaymentFeignApi;
import com.hhq.order.feign.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    HttpClient httpClient;

    @Autowired
    PaymentFeignApi paymentFeignApi;

    @GetMapping("/testGetPayment/{id}")
    public Result<Payment> getResult(@PathVariable("id")String id){
        Payment result = paymentFeignApi.getResult(id);
        return Result.success(result);
    }
}
