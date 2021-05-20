package com.pkj.boker.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

  @Autowired private List<String> abc;

  @GetMapping
  public List<String> abc() {

    ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
    List abc = context.getBean("abc", List.class);
    return abc;
  }

  @GetMapping("/test")
  public List<String> abcList() {
    return abc;
  }
}
