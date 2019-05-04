package pl.sidor.CarSalon.controller;

import models.Role;
import models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @PostMapping(value = "/userPage")
    public String home(@ModelAttribute User user, Model model) {
        System.out.println(user.getEmail());
        user.setRole(new Role(2,"USER"));
        model.addAttribute("user", user);
        return "userPanel";
    }
}
