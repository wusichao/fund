package com.wusichao.view.controller;

import com.wusichao.view.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FundController {

    @Autowired
    DemoMapper mapper;

    @GetMapping("hello")
    public String hello() {
        mapper.save(1);
        return "hello";
    }
}
