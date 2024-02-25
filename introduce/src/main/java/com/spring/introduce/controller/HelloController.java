package com.spring.introduce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// 컨트롤러를 의미하는 애노테이션
@Controller
public class HelloController {

    // hello URL로 Get 요청이 들어올 경우 수행 
    @GetMapping("/hello")
    public String hello(Model model) {
        
        // model 객체에 date:hello! 담기 
        model.addAttribute("data","hello!");
        
        // hello.html 파일로 전달
        return "hello";
    }
}
