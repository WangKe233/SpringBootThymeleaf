package com.example.Controller;

import com.example.Entity.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by WK on 2018/3/29.
 */

@Controller
public class RegLoginController {
    @RequestMapping("/")
    public String index(Model model){
        Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
        model.addAttribute("Msg",msg);
        return "index";
    }


}
