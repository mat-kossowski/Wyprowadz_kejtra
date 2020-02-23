package pl.kossowski.project.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import pl.kossowski.project.exception.DuplicatedUsernameException;
import pl.kossowski.project.model.Role;


@ControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(value = RuntimeException.class)
    public ModelAndView handleException(RuntimeException exception) {
        ModelAndView exceptionModelAndView = new ModelAndView("exception");
        exceptionModelAndView.addObject("message", exception.getMessage());
        return exceptionModelAndView;
    }


    @ExceptionHandler(value = DuplicatedUsernameException.class)
    public ModelAndView handleDuplicatedException(DuplicatedUsernameException exception) {
        ModelAndView exceptionModelAndView = new ModelAndView("exceptionUser");
        exceptionModelAndView.addObject("message", exception.getMessage());
        if(exception.getRole().getId() == 1) {
            exceptionModelAndView.addObject("url", "/addGuardian");
            return exceptionModelAndView;
        }
        exceptionModelAndView.addObject("url", "/addOwner");
        return exceptionModelAndView;

    }
}
