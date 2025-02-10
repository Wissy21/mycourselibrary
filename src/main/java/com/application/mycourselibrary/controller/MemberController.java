package com.application.mycourselibrary.controller;

import com.application.mycourselibrary.entity.Member;
import com.application.mycourselibrary.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PutMapping("/member/{id}")
    public Member updateMember(@PathVariable Long id, @RequestBody Member memberDetails) {
        return memberService.updateMember(id, memberDetails);
    }

    @DeleteMapping("/member/{id}")
    public void deleteMember(@PathVariable Long id) {
        memberService.deleteMember(id);
    }

    @PostMapping("/member")
    public Member createMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }
}
