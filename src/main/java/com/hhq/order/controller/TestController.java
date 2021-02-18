package com.hhq.order.controller;

import com.alibaba.fastjson.JSONObject;
import com.hhq.common_sdk.rest.HttpClient;
import com.hhq.common_sdk.result.Result;
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

    @GetMapping("/testGetPayment/{id}")
    public Result<JSONObject> getResult(@PathVariable("id")String id){
        JSONObject jsonObject = httpClient.get("http://127.0.0.1:8001/test/testGetPayment/" + id, null, null);
        return Result.success(jsonObject);
    }
}
