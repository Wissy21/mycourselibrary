package com.application.mycourselibrary.repository;

import com.application.mycourselibrary.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
