package com.pkj.boker.demo.fourth;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class SampleAuthWebConfig implements WebMvcConfigurer {

  private final SampleAuthInterceptor sampleAuthInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {

    registry.addInterceptor(sampleAuthInterceptor).addPathPatterns("/sample/**");
  }
}
