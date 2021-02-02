package com.wusichao.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.util.stream.Stream;

@RestController
public class FetchFromDayDay {

    @Autowired
    private RestTemplate restTemplate;

    private static final String fundUrl = "http://fund.eastmoney.com/js/fundcode_search.js";

    @GetMapping("fund")
    public String fund() throws UnsupportedEncodingException {
        String data = restTemplate.getForObject(fundUrl, String.class);
        //String data = new String(result.getBytes("UTF-8"),"UTF-8");
        String[] split = data.substring(13,1000).split("],\\[");
        Stream.of(split).forEach(System.out::println);
        return "success";
    }


}
