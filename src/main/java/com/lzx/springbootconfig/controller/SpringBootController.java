package com.lzx.springbootconfig.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController//如果每个功能都是返回Restful 内容的话
public class SpringBootController {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
    @RequestMapping("/info/{msg}")
    public String show(@PathVariable String msg){
        return "show:" + msg;
    }

    @RequestMapping("/show")
    public String showInfo(){
        return "show";
    }

}
