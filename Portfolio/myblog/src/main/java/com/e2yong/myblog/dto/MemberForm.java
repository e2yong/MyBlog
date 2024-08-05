package com.e2yong.myblog.dto;

/**
 * 회원가입 Form 요청 -> MemberService
 * 요청을 담는 DTO
 */

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberForm {
    private String name;
    private String loginId;
    private String password;
    private String email;
}