package com.dzb.springbootdemo.test;

import com.dzb.springbootdemo.Utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class index {


    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        String key = "key";
        //redisUtils.set(key, "hello world!");
        redisUtils.set(key, "nimasile", 10);
        return redisUtils.get(key).toString();
    }
}

