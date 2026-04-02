package com.ai.wiki.contrroller;

import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello Post "+name;
    }
}
