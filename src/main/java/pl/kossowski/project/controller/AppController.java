package pl.kossowski.project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @GetMapping("/home")
    public ModelAndView getHomePage(){return new ModelAndView("home");}


    @GetMapping("/index")
    public ModelAndView IndexPage(){return new ModelAndView("index");}

    @GetMapping("/guardian")
    public ModelAndView getGuardianPage() {
        return new ModelAndView("guardian");
    }

    @GetMapping("/owner")
    public ModelAndView getOwnerPage() {
        return new ModelAndView("owner");
    }

    @GetMapping("/login")
    public ModelAndView getLoginPage() {
        return new ModelAndView("login");
    }

    @GetMapping("/accessDenied")
    public ModelAndView getAccessDeniedPage() {
        return new ModelAndView("accessDenied");
    }
}
