package com.sedion.mynawang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther mynawang
 * @create 2016-09-30 10:03
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {


    @ResponseBody
    public String test() {
        return "123";
    }

    @RequestMapping(value = "/qr")
    public ModelAndView getQr() {
        System.out.println("123123");
        ModelAndView mav = new ModelAndView("test");
        return mav;
    }
}
