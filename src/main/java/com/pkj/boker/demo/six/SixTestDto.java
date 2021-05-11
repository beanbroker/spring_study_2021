package com.pkj.boker.demo.six;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class SixTestDto {

  private LocalDateTime now;
}
