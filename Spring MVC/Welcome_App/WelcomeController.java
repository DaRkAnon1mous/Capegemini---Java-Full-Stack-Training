package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String showMessage(Model model) {
        model.addAttribute("message", "Welcome to Spring MVC");
        return "message";  // Redirects to message.jsp
    }
}
