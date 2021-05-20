package com.pkj.boker.demo.six;

import com.pkj.boker.demo.six.error.ConflictException;
import com.pkj.boker.demo.six.error.ForbiddenException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
@RequestMapping("/six")
public class SixController {

  private final SixTestService sixTestService;

  @Value("${broker.test}")
  private String test;

  public SixController(SixTestService sixTestService) {
    this.sixTestService = sixTestService;
  }

  @GetMapping("/test")
  public String test() {
    return test;
  }

  @GetMapping("/time")
  public SixTestDto decimal() {
    return SixTestDto.builder().now(LocalDateTime.now()).build();
  }

  @GetMapping("/users/{userId}")
  public String test(@PathVariable("userId") String userId) {

    log.info("userId : {}", userId);
    return userId;
  }

  @GetMapping("/unique")
  public void unique() {
    if (1 == 1) {
      throw new ConflictException("유니트하데");
    }
  }

  @GetMapping("/forbidden")
  public void forbidden() {
    if (1 == 1) {
      throw new ForbiddenException("권한이 없데");
    }
  }
}
