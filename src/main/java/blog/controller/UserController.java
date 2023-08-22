package blog.controller;

import blog.forms.RegisterNewUser;
import blog.model.User;
import blog.services.User.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/users/login")
    public String loginPage(User user){
        return "users/login";
    }

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public String login(RegisterNewUser user, Model model){
        System.out.println("Here");

        if (userService.authenticate(user.getUsername(), user.getPassword())){
            return "redirect:/posts/posts";
        }
            return "redirect:/";
    }

}
