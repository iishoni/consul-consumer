package com.dxk.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping("/")
    public String hello() {
        return helloService.hello();
    }
}

@FeignClient("consul-provider")
interface HelloService {

    @GetMapping("/")
    String hello();

}