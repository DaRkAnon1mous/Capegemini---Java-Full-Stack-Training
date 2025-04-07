package controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import model.Advertisement;

@Controller
public class AdvertisementController {
	
	@RequestMapping("/getdetails")
	String getAdvertisementpage(@ModelAttribute("advertisement")Advertisement aobj)
	{
		return "advertisement";
	}
	
	@RequestMapping("/display")
	String displayAdvertisementDetails(@ModelAttribute("advertisement")Advertisement aobj)
	{
		return "success";
	}
}