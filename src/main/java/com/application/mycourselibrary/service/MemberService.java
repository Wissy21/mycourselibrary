package com.application.mycourselibrary.service;

import com.application.mycourselibrary.entity.Member;
import com.application.mycourselibrary.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Member createMember(Member member) {
        return memberRepository.save(member);
    }
    public Member updateMember(Long id, Member memberDetails) {
        Member member = memberRepository.findById(id).orElseThrow(() ->
        new IllegalArgumentException("Member not found"));
        member.setName(memberDetails.getName());
        member.setEmail(memberDetails.getEmail());
        return memberRepository.save(member);
    }
    public void deleteMember(Long id){
        Member member = memberRepository.findById(id).orElseThrow(() -> new RuntimeException("Member not found"));
        memberRepository.deleteById(member.getId());
    }
}
