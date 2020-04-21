package com.jmm.ind_sale_storage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("index")
    public String index(Map<String, Object> map){
        map.put("index","1");
        Map resultMap = new HashMap();
        resultMap.put("index", 0);
        resultMap.put("name", "1111");
        map.put("item", resultMap);
        return "index";
    }
}
