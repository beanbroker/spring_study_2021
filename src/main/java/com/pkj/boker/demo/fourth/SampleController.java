package com.pkj.boker.demo.fourth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/sample")
@RestController
@SampleAuth
public class SampleController {

  @GetMapping("/auth")
  public void test() {

    log.info("test pass");
  }
}
