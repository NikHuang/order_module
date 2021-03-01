package com.hhq.order.feign;

import com.hhq.common_sdk.result.Result;
import com.hhq.order.feign.pojo.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PAYMENT")
@Service
public interface PaymentFeignApi {

    @GetMapping(value = "/test/testGetPayment/{id}",produces = {"application/json;charset=UTF-8"})
    Payment getResult(@PathVariable("id")String id);
}
