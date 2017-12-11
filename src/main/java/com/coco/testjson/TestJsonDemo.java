package com.coco.testjson;

import net.sf.json.JSONArray;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/11.
 */
@Controller
@RequestMapping("/testJson")
public class TestJsonDemo {
    private Log log = LogFactory.getLog(TestJsonDemo.class);

    @RequestMapping(value = "test1.do")
    public String test1(){
        log.info("test1 is called...");
        return "testJson";
    }

    @RequestMapping(value = "test2.do")
    @ResponseBody
    public String test2(String ds){
        log.info("test2 is called...");
        JSONArray jsonArray= JSONArray.fromObject(ds);
        List<Map> list=(List)JSONArray.toCollection(jsonArray,Map.class);
        for (Map map:list){
            log.info(map.get("name"));
            log.info(map.get("age"));
        }
        return "ok";
    }
}
