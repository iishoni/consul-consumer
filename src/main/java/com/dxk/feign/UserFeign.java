package com.dxk.feign;

import com.iishoni.api.UserApi;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("consul-provider-dev")
public interface UserFeign extends UserApi {
}