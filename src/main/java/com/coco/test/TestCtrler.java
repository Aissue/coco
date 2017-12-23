package com.coco.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/11/18.
 */

@Controller
@RequestMapping("/myMVC")
public class TestCtrler {

    @RequestMapping(value = "index.do")
    public String index(){
        return "myThread";
    }

}
