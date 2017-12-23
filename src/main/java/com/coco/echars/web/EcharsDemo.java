package com.coco.echars.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/12/21.
 */
@Controller
@RequestMapping("/echarsDemo")
public class EcharsDemo {

    @RequestMapping(value = "test1.do")
    public String test1(){
        return "testEchars";
    }
}
