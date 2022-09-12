package com.silvericedan.microservices.limitsservice.controller;

import com.silvericedan.microservices.limitsservice.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

  @GetMapping("/limits")
  public Limits retrieveLimits(){
    return Limits.builder().minimum(1).maximum(1000).build();
  }
}
