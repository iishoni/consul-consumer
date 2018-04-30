package com.iishoni.consulconsumer.web;

import com.iishoni.consulconsumer.feign.UserFeign;
import com.iishoni.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    private UserFeign userFeign;

    @GetMapping("/{id}")
    public String hello(@PathVariable Long id) {
        User user = userFeign.getUserInfo(id).getData();
        return "hello【" + user.getUsername() + "】";
    }
}

