package com.e2yong.myblog.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Table(name = "member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "member_no")
    private UUID memberNo;          // 회원번호, PRIMARY KEY

    @Column(name = "member_name")
    private String name;            // 회원이름

    @Column(name = "member_loginid")
    private String loginId;         // 로그인ID

    @Column(name = "member_password")
    private String password;        // 패스워드

    @Column(name = "member_email")
    private String email;           // 이메일

    @Column(name = "member_role")
    @Enumerated(EnumType.STRING)
    private MemberRole role;          // USER, ADMIN

    @Builder
    public Member(String name, String loginId, String password, String email) {
        this.name = name;
        this.loginId = loginId;
        this.password = password;
        this.email = email;
        this.role = MemberRole.USER;
    }
}
