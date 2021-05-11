package com.pkj.boker.demo.six.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@Configuration
@Profile("dev")
public class SixWebConfig extends WebMvcConfigurationSupport {

  @Override
  protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    converters.add(customMessageConverter());
  }

  private HttpMessageConverter<?> customMessageConverter() {

    MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
    converter.setObjectMapper(customMapper());
    return converter;
  }

  private ObjectMapper customMapper() {
    return CustomObjectMapper.setting();
  }
}
