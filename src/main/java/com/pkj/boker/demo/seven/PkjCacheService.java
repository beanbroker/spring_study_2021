package com.pkj.boker.demo.seven;

import com.pkj.boker.demo.seven.cache.RedisName;
import com.pkj.boker.demo.seven.cache.RedisValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PkjCacheService {

  @Cacheable(
      value = RedisValue.NAME_CACHE,
      cacheManager = RedisName.PKJ_ONE_MINUTE_CACHE,
      unless = "#result==null",
      key = "'user-name' + #id")
  public String getUserName(String userId) {

    log.info("call redis");

    return "pkj".equals(userId) ? "pkj" : null;
  }
}
