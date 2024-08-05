/**
 * Home과 Login 페이지
 */
package com.e2yong.myblog;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@Tag(name = "Home Controller", description = "Home and Login")
public class HomeController {

    @GetMapping("/home")
    @Operation(summary = "Home", description = "홈 페이지로 이동")
    public String home() {
        log.info("Get Home");
        return "/home";
    }

    @GetMapping("/login")
    @Operation(summary = "Login", description = "로그인 페이지로 이동")
    public String login() {
        log.info("Get Login");
        return "/login";
    }
}
