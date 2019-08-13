package com.lzx.springbootconfig.controller;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.web.WebAppConfiguration;
//测试那个类
@SpringBootTest(classes=SpringBootController.class)
//谁来测试
@RunWith(SpringJUnit4ClassRunner.class)
//web功能
@WebAppConfiguration
public class TestSpringController {
    @Autowired
    private SpringBootController springBootController;
    @Test
    public void test(){
        //断言
        // 期望值和返回值判断
        TestCase.assertEquals(this.springBootController.test(),"test");

    }
}
