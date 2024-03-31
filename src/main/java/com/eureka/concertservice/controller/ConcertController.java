package com.eureka.concertservice.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/concert")
public class ConcertController {
    @GetMapping("")
    public String hello(){
        return "hello!";
    }

    // 토큰 출력용
    @GetMapping("/token")
    public String getToken(HttpServletRequest request) {
        return request.getHeader("Authorization");
    }
}
