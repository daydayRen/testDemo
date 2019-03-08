package com.yitian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：yitianRen
 * @date ：Created in 2019-3-7 16:54
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class MyController {

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String  getHello(){
        return "hello world00000111";
    }
}
