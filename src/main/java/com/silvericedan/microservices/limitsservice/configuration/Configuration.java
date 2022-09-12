package com.silvericedan.microservices.limitsservice.configuration;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter(value = AccessLevel.PACKAGE)
@Component
@ConfigurationProperties("limits-service")
public class Configuration {

  private int minimum;
  private int maximum;

}
