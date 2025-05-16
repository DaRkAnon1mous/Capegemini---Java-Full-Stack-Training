package in.sp.main;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import in.sp.beans.*;
@Controller
public class MyController {
	
	//@RequestMapping(value = "/YourPage", method = RequestMethod.GET)
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage() {
		System.out.println("Opening page");
		ModelAndView mav = new ModelAndView("hello");
		
		return mav;
	}
	@GetMapping("/aboutUs")
	public String openAboutUs() {
		
		return "about-us";
		
	}
	
	@GetMapping("/formPage")
	public String openForm() {
		return "Form";
	}
	
	// Less Used method
//	@PostMapping("/submitForm")
//	public String handleForm(HttpServletRequest req) {
//		String name = req.getParameter("name1");
//		String email = req.getParameter("email1");
//		String phoneno = req.getParameter("phoneno1");
//		
//		System.out.println("Name: "+name);
//		System.out.println("Email: "+email);
//		System.out.println("Phoneno: "+phoneno);
//		return "profile";
//	}
	
	@PostMapping("/submitForm")
	public String handleForm(@RequestParam("name1") String name, 
			                 @RequestParam("email1") String email,
			                 @RequestParam("phoneno1") String phoneno,
			                 Model model) {
		
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Phoneno: "+phoneno);
		
		User u = new User();
		u.setName(name);
		u.setEmail(email);
		u.setPhoneno(phoneno);
		
		model.addAttribute("model_user",u);
		
		return "profile";
		
	}
	

}
