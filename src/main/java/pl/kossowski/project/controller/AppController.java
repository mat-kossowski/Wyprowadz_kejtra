package pl.kossowski.project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @GetMapping("/home")
    public ModelAndView getHomePage(){return new ModelAndView("home");}

    @GetMapping("/")
    public ModelAndView getFirstPage(){return new ModelAndView("index");}

    @GetMapping("/index")
    public ModelAndView IndexPage(){return new ModelAndView("index");}

    @GetMapping("/guardian")
    public ModelAndView getGuardianPage() {
        return new ModelAndView("guardian");
    }

    @GetMapping("/db_guardian")
    public ModelAndView getDbGuardianPage() {
        return new ModelAndView("db_guardian");
    }

    @GetMapping("/onas")
    public ModelAndView getONasPage() {
        return new ModelAndView("onas");
    }

    @GetMapping("/contact")
    public ModelAndView getContactPage() {
        return new ModelAndView("contact");
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
