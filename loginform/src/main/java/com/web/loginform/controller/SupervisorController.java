package com.web.loginform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/users")

public class SupervisorController {

    @GetMapping("/supervisor")
    public String showSupervisorPage() {
        return "supervisor";
    }
}
