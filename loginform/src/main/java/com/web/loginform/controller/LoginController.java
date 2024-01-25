package com.web.loginform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.loginform.model.User;
import com.web.loginform.service.UserService;
import org.springframework.ui.Model;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        User user = userService.findByUsernameAndPassword(username, password);

        if (user != null) {
            if (user.getRole() != null && !user.getRole().isEmpty()) {
                String role = user.getRole().toLowerCase();
                System.out.println("Your role is " + role);

                return "redirect:/" + "api/users/welcome";
            } else {
                model.addAttribute("error", "User role is not defined");
                return "login";
            }
        } else {
            model.addAttribute("error", "User is not found");
            return "login";
        }
    }
}
