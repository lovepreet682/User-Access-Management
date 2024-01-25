
package com.web.loginform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.web.loginform.model.AdminReport;
import com.web.loginform.service.UserServiceImpl;

@Controller
@RequestMapping("/api/users")
public class WelcomeController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/welcome")
    public String showAdminPage() {
        return "welcome";
    }

    @GetMapping("/AdminActivityReport")
    public String AdminActivityReport() {
        return "AdminActivityReport";
    }

    @GetMapping("/RoleRightReport")
    public String RoleRightReport() {
        return "RoleRightReport";
    }

    @GetMapping("/PopulationReport")
    public String PopulationReport() {
        return "PopulationReport";
    }

    @GetMapping("/adminreport")
    public String adminReport(Model model) {
        List<AdminReport> reports = userServiceImpl.getAllReport();
        model.addAttribute("adminReports", reports);
        return "AdminActivityReport";
    }

}
