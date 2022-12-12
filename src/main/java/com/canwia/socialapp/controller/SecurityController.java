package com.canwia.socialapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class SecurityController {

    @GetMapping("/hello")
    public void hello(){
        System.out.println("Hello User");
    }


    @PostMapping("/hello")
    public void helo(){
        System.out.println("Hello Admin");
    }
}
