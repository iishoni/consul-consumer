package com.iishoni.consulconsumer.feign;

import com.iishoni.api.UserApi;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("${provider}")
public interface UserFeign extends UserApi {
}