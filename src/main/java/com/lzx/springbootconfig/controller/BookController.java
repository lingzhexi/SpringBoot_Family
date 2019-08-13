package com.lzx.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("book")
@RestController()
//安全的配置 且需要get/set,和Value注解使用不同
@ConfigurationProperties(prefix = "book")
public class BookController {

//    @Value("${book.author}")

    private String author;

//    @Value("${book.name}")
    private String name;

    @RequestMapping("/bookInfo")
    public String showInfo(){
        return author + name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
