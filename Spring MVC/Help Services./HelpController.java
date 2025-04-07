package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.HelperBean;
import com.service.HelperService;


@Controller
public class HelpController {
	
	@Autowired
	private HelperService helpService;
	
	@RequestMapping(value="/showpage",method=RequestMethod.GET)
	public String showPage(@ModelAttribute("helper") HelperBean helperBean, 
			BindingResult result) {
		
		return "showpage";

	}
	
	@ModelAttribute("serviceList")
	public  Map<String, String> buildState(){
		Map<String,String> m=new HashMap<String,String>();
		m.put("ACService", "ACService");
		m.put("WashingMachineService","WashingMachineService");
		m.put("RefrigeratorService","RefrigeratorService");
		return m;

	}


	@RequestMapping(value="/helpdesk",method=RequestMethod.POST)
	public String calculateTotalCost(@ModelAttribute("helper")HelperBean helperBean, 
			ModelMap model,BindingResult result) {
		double c=helpService.calculateTotalCost(helperBean);
		model.addAttribute("cost",c);
		return "helpdesk";
	}
	
	
	
	
}
