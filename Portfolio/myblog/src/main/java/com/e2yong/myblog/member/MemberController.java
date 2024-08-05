package com.e2yong.myblog.member;

import com.e2yong.myblog.dto.MemberForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
@Tag(name = "Member Controller", description = "회원 관리")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    /** GET 회원 가입 페이지 */
    @GetMapping("/members/new")
    @Operation(summary = "CreateMemberForm", description = "회원가입 페이지")
    public String createMemberForm() {
        return "members/createMemberForm";
    }

    /** POST 회원 가입 요청 */
    @PostMapping("/members/new")
    @Operation(summary = "CreateMember", description = "회원가입 요청")
    public String createMember(MemberForm form) {
        // 회원 가입
        memberService.join(form);

        // 로그인 ID 중복인 경우

        return "redirect:/";
    }


}
