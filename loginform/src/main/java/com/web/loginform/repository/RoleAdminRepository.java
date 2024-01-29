package com.web.loginform.repository;
import com.web.loginform.model.RoleReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleAdminRepository extends JpaRepository<RoleReport, Long>{
    
}