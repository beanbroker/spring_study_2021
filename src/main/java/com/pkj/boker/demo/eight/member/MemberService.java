package com.pkj.boker.demo.eight.member;

import com.pkj.boker.demo.six.error.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {

  private final MemberRepository memberRepository;

  public MemberService(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

  @Transactional
  public void createUser(MemberEntity memberEntity) {

    memberRepository.save(memberEntity);
  }

  @Transactional
  public void updateAge(Long id, AgeReq req) {
    MemberEntity memberEntity =
        memberRepository.findById(id).orElseThrow(() -> new NotFoundException("not found"));
    memberEntity.setAge(req.getAge());

    memberRepository.save(memberEntity);
  }
}
