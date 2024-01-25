package com.web.loginform.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.web.loginform.model.PopulationReport;

public interface PopulationRepositary extends JpaRepository<PopulationReport, Integer>{
    
}
