package com.silvericedan.microservices.limitsservice.controller;

import com.silvericedan.microservices.limitsservice.bean.Limits;
import com.silvericedan.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

  @Autowired
  private Configuration configuration;

  @GetMapping("/limits")
  public Limits retrieveLimits(){
    return Limits.builder()
        .minimum(configuration.getMinimum())
        .maximum(configuration.getMaximum())
        .build();
  }
}
