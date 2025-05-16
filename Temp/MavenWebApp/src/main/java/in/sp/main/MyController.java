package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	//@RequestMapping(value = "/YourPage", method = RequestMethod.GET)
	@GetMapping("/helloPage")
	public ModelAndView openPage() {
		System.out.println("Opening page");
		ModelAndView mav = new ModelAndView("hello");
		
		return mav;
	}
	@GetMapping("/aboutUs")
	public String openAboutUs() {
		
		return "about-us";
		
	}

}
