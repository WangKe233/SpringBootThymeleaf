package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WK on 2018/3/29.
 */
@Controller
public class DoLogin {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
        public String login(){
        return "loginIn";
    }

    @RequestMapping("/signin")
    public String signIn(){
        return "signIn";
    }
}
