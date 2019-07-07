package com.mumu.config;

import com.mumu.config.config.SpirngApplicationUtil;
import com.mumu.config.dto.req.DecisionReq;
import com.mumu.config.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.HelloService;

@RestController
public class HelloController {
    //注入自定义starter内逻辑

    @RequestMapping("/hello")
    public String hello(){
        return "Hello consul";
    }

    @RequestMapping("/test")
    public String test(){
        TestService testService = SpirngApplicationUtil.getBean("testService");
        testService.test();
        return "";
    }

    @PostMapping("/json")
    public String jsonBean(@RequestBody DecisionReq req){
        System.out.println("==========App_Name: "+req.getAppName());
        System.out.println("==========product_id: " + req.getProductId());
        return "";
    }

}
