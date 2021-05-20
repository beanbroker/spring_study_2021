package com.pkj.boker.demo.seven;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class SevenUser {

  @NotBlank private String name;
  @NotBlank private String address;

  @Min(1)
  private Integer age;
}
