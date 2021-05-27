package com.pkj.boker.demo.eight;

import com.pkj.boker.demo.eight.member.AgeReq;
import com.pkj.boker.demo.eight.member.MemberReq;
import com.pkj.boker.demo.eight.member.MemberService;
import com.pkj.boker.demo.eight.member.MemberTempService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/eight")
@RestController
public class EightController {

  private final MemberService memberService;
  private final MemberTempService memberTempService;

  public EightController(MemberService memberService, MemberTempService memberTempService) {
    this.memberService = memberService;
    this.memberTempService = memberTempService;
  }

  @PostMapping
  public void testSave(@RequestBody MemberReq req) {
    memberService.createUser(req.toMemberEntity());
  }

  @PutMapping("/{id}")
  public void testSave(@PathVariable("id") Long id, @RequestBody AgeReq req) {
    memberService.updateAge(id, req);
  }

  @PutMapping("/test1/{id}")
  public void test1(@PathVariable("id") Long id, @RequestBody AgeReq req) {
    memberTempService.updateWithoutTransaction(id, req);
  }

  @PutMapping("/test2/{id}")
  public void test2(@PathVariable("id") Long id, @RequestBody AgeReq req) {
    memberTempService.updateWithTransaction(id, req);
  }

}
