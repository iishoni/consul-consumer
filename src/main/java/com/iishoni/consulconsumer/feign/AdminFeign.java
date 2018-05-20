package com.iishoni.consulconsumer.feign;

import com.iishoni.api.AdminApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("${provider}")
public interface AdminFeign extends AdminApi {
}