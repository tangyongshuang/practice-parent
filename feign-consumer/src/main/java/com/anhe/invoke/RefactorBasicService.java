package com.anhe.invoke;

import com.anhe.dto.com.anhe.service.BasicService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "BASIC-APPLICATION")
public interface RefactorBasicService extends BasicService {

}
