package com.web.loginform.service;

import com.web.loginform.model.User;
import java.util.List;
import com.web.loginform.model.AdminReport;

public interface UserService {
    User findByUsernameAndPassword(String username, String password);

    // List of adminReport
    public List<AdminReport> getAllReport();
}
