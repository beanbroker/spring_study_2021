package com.pkj.boker.demo.seven;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/seven")
@RestController
public class SevenTestController {

  private final PkjCacheService pkjCacheService;

  public SevenTestController(PkjCacheService pkjCacheService) {
    this.pkjCacheService = pkjCacheService;
  }

  @GetMapping("/test-redis")
  public String getName(@RequestParam("userId") String userId) {
    return pkjCacheService.getUserName(userId);
  }

  @PostMapping("/sign-up")
  public String signUp(@Valid @RequestBody SevenUser sevenUser) {

    return "ok";
  }
}
