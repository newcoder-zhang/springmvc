package com.huawei.www.controller;

import com.huawei.www.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/show")
public class UserController {
    @RequestMapping("/showUser")
    public ModelAndView showUser(ModelAndView model, HttpServletRequest request){
        model.setViewName("showUser");
        User user = new User("lily",23);
        model.addObject("user",user);
//     request.setAttribute("user",user);
        return model;
    }
}
