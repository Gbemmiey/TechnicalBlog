package blog.controller;

import blog.forms.RegisterNewUser;
import blog.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping("/users/login")
    public String loginPage(User user){
        return "users/login";
    }

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public String login(User user, Model model){
        boolean validUser = true;
        if (validUser){
            return "redirect:/posts/posts";
        }
        else {
            return "redirect:/users/login";
        }
    }

}
