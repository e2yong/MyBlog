package com.e2yong.myblog.member;

import com.e2yong.myblog.entity.Member;
import com.e2yong.myblog.dto.MemberForm;
import com.e2yong.myblog.entity.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * 회원가입, 회원수정, 회원삭제
 */

@Service
@Slf4j
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * 회원 가입
     */
    public UUID join(MemberForm form) {

        // 회원 객체 생성
        Member member = Member.builder()
                .name(form.getName())
                .loginId(form.getLoginId())
                .password(form.getPassword())
                .email(form.getEmail())
                .build();

        // 로그인ID 중복 검증

        // 회원을 DB에 저장
        memberRepository.save(member);
        log.info("회원가입 성공, 회원번호={}", member.getMemberNo());

        // 회원번호 반환
        return member.getMemberNo();
    }


}
