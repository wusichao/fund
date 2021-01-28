package com.wusichao.view.controller;

import com.wusichao.view.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class FundController {

    @Autowired
    private RestTemplate restTemplate;
    String url = "http://fund.eastmoney.com/js/fundcode_search.js";
        String url2 = "http://fundgz.1234567.com.cn/js/001186.js?rt=1463558676006";
        String url3 = "http://fund.eastmoney.com/pingzhongdata/110011.js?v=20160518155842";

    @Autowired
    DemoMapper mapper;

    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        //mapper.save(1);
        String result = restTemplate.getForEntity("http://api.fund.eastmoney.com/f10/lsjz?callback=jQuery18306657434687412329_1611847603802&fundCode=110011&pageIndex=1&pageSize=20&startDate=&endDate=&_=" + System.currentTimeMillis(), String.class).getBody();
        return result;
    }
}
