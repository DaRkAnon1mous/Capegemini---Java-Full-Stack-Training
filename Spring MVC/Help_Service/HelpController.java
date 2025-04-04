package com.controller;

import com.model.HelperBean;
import com.service.HelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelpController {

    @Autowired
    private HelperService helpService;

    @RequestMapping(value = "/showpage", method = RequestMethod.GET)
    public String showPage(@ModelAttribute("helper") HelperBean helper, BindingResult result) {
        return "showpage";
    }

    @RequestMapping(value = "/calculateTotalCost", method = RequestMethod.POST)
    public String calculateTotalCost(@ModelAttribute("helper") HelperBean helper, ModelMap model, BindingResult result) {
        double totalCost = helpService.calculateTotalCost(helper);
        model.addAttribute("message", "Thank you for choosing our Service. You need to pay Rs." + totalCost + "/-");
        return "helpdesk";
    }

    @ModelAttribute("serviceList")
    public Map<String, String> buildState() {
        Map<String, String> serviceList = new HashMap<>();
        serviceList.put("ACService", "ACService");
        serviceList.put("WashingMachineService", "WashingMachineService");
        serviceList.put("RefrigeratorService", "RefrigeratorService");
        return serviceList;
    }
}