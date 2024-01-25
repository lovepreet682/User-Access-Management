package com.web.loginform.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.web.loginform.model.AdminReport;

public interface AdminRepository extends JpaRepository<AdminReport, Integer>{
    
}
