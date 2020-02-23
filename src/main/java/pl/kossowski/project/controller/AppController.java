package pl.kossowski.project.controller;


import net.bytebuddy.description.modifier.Ownership;
import org.hibernate.annotations.GeneratorType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.kossowski.project.model.User;
import pl.kossowski.project.service.UserService;

@Controller
public class AppController {
    public AppController(UserService userService) {
        this.userService = userService;
    }

    private final UserService userService;


    @GetMapping("/home")
    public ModelAndView getHomePage() {
        return new ModelAndView("home");
    }

    @GetMapping("/")
    public ModelAndView getFirstPage() {
        return new ModelAndView("index");
    }

    @GetMapping("/index")
    public ModelAndView IndexPage() {
        return new ModelAndView("index");
    }

    @GetMapping("/login")
    public ModelAndView getLoginPage() {
        return new ModelAndView("login");
    }

    @GetMapping("/accessDenied")
    public ModelAndView getAccessDeniedPage() {
        return new ModelAndView("accessDenied");
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute User user) {
        userService.addUser(user);
        return "redirect:/";
    }


    @GetMapping("/addGuardian")
    public ModelAndView createGuardianView() {
        ModelAndView modelAndView = new ModelAndView("addUser");
        User user = new User();
        user.setRole(userService.getGuardianRole());
        modelAndView.addObject("user" , user);
        return modelAndView;
    }
    @GetMapping("/login/{username}")
    public ModelAndView userDetailsView(@PathVariable String username) {
        ModelAndView modelAndView = new ModelAndView("userView");
        modelAndView.addObject("user", userService.loadUserByUsername(username));
        return modelAndView;
    }


    @GetMapping("/addOwner")
    public ModelAndView createOwnerView() {
        ModelAndView modelAndView = new ModelAndView("addUser");
        User user = new User();
        user.setRole(userService.getOwnerRole());
        modelAndView.addObject("user" , user);
        return modelAndView;
    }

    @GetMapping("/user/delete/{username}")
    public String removeUser(@PathVariable String username) {
        userService.deleteUser(username);
        return "redirect:/users";
    }


}
