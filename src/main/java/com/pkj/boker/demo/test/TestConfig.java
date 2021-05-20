package com.pkj.boker.demo.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class TestConfig {

  @Bean
  public List<String> abc() {
    return Arrays.asList("a", "b", "c");
  }
}
