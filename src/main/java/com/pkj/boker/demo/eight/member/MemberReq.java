package com.pkj.boker.demo.eight.member;

import lombok.Getter;

@Getter
public class MemberReq {

  private String name;
  private Integer age;

  public MemberEntity toMemberEntity() {

    return MemberEntity.builder().name(name).age(age).build();
  }
}
