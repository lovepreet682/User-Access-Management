package com.web.loginform.service;

import com.web.loginform.model.User;
import java.util.List;
import com.web.loginform.model.AdminReport;
import com.web.loginform.model.PopulationReport;

public interface UserService {
    User findByUsernameAndPassword(String username, String password);

    // List of adminReport
    public List<AdminReport> getAllReport();

    // List of Population Report
    public List<PopulationReport> getPopulationReport();

}
