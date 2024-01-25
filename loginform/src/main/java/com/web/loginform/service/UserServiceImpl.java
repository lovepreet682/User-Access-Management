package com.web.loginform.service;

import com.web.loginform.model.AdminReport;
import com.web.loginform.model.User;
import com.web.loginform.repository.AdminRepository;
import com.web.loginform.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public List<AdminReport> getAllReport() {
        // System.out.println(adminRepository.findAll());
        return adminRepository.findAll();
    }

}
