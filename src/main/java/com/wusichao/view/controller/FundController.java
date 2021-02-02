package com.wusichao.view.controller;

import com.wusichao.view.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
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
    public byte[] hello() {
        //mapper.save(1);
        String url = "https://dgss0.bdstatic.com/5bVWsj_p_tVS5dKfpU_Y_D3/qiusuo_icon/5a6639075515a8e27e0b1336db2300c1.ico";
        ResponseEntity<byte[]> responseEntity = restTemplate
                .exchange(url, HttpMethod.GET, null, byte[].class);
        return responseEntity.getBody();
    }
}
