package com.e2yong.myblog.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // 로그인ID로 회원 조회
    Optional<Member> findByLoginId(String loginId);

    // 로그인ID로 회원 삭제
    void deleteByLoginId(String loginId);
}
