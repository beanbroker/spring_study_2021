package com.pkj.boker.demo.eight.member;

import com.pkj.boker.demo.six.error.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberTempService {

  private final MemberRepository memberRepository;
  private final MemberService memberService;

  public MemberTempService(MemberRepository memberRepository, MemberService memberService) {
    this.memberRepository = memberRepository;
    this.memberService = memberService;
  }

  public void updateWithoutTransaction(Long id, AgeReq req) {

    MemberEntity memberEntity =
        memberRepository.findById(id).orElseThrow(() -> new NotFoundException("not found"));
    memberEntity.setName("hohohohoho?");

    memberRepository.save(memberEntity);

    System.out.println("dkdfldfldlf");
    memberService.updateAge(id, req);
  }

  @Transactional
  public void updateWithTransaction(Long id, AgeReq req) {

    MemberEntity memberEntity =
        memberRepository.findById(id).orElseThrow(() -> new NotFoundException("not found"));
    memberEntity.setName("withwith?");

    memberRepository.save(memberEntity);

    System.out.println("dkdfldfldlf");
    memberService.updateAge(id, req);
  }
}
