package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by WK on 2018/3/30.
 */
@Controller
public class RegController {

    /*做登陆*/
    @RequestMapping(value = "/doReg", method = RequestMethod.POST)
    public String doReg(@RequestParam("email") String Email, @RequestParam("password") String password){
        System.out.println(Email+"   "+password);
        return "redirect:index";
    }
}
