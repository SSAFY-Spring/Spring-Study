package com.spring.introduce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    // hello-mvc URL로 Get 요청이 들어올 경우 수행 
    @GetMapping("/hello-mvc")
    
    // name 파라미터를 받아 name 변수에 저장
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name",name);
        return "hello-template";
    }
}
