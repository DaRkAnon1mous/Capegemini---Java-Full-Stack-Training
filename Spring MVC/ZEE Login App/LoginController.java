package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;
import com.bean.LoginBean;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class LoginController {

    @Autowired
    private LoginService service;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginpage(Model model) {
        model.addAttribute("login", new LoginBean());
        return "login";
    }

    @RequestMapping(value = "/submitlogin", method = RequestMethod.POST)
    public String checkLoginDetails(@ModelAttribute("login") LoginBean loginBean, 
                                    BindingResult result) {
        if (service.validate(loginBean)) {
            return "success";
        } else {
            return "invalid";
        }
    }
}
