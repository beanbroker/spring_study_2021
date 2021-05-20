package com.pkj.boker.demo.six;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Slf4j
@Profile({"local"})
public class SixConfig {

  @Bean
  public String six() {

    log.info("say!!! profile working");

    return "six";
  }
}
