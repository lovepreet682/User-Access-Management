package com.web.loginform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "population_report")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PopulationReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String employeecode;
    private String branchcode;
    private String branchname;
    private String departmentcode;
    private String departmentname;
    private String profile1;
    private String status1;
    private String creationdatetime;
    private String lastmodifiedmarkerid;
    private String lastmodifiedmarkername;
    private String markerdatetime;
    private String lastmodifiedcheckerid;
    private String checkername;
    private String checkerdatetime;
    private String disableddatetime;
    private String profileenddatetime;
}
