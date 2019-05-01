package pl.sidor.CarSalon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {


    @GetMapping(value = "welcome")
    public String welcome() {
        return "index";
    }

    @GetMapping(value = "register")
    public String register() {
        return "register";
    }

    @GetMapping(value = "privacy")
    public String privacy() {
        return "privacy";
    }


}
