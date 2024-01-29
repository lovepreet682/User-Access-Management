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
@Table(name = "role_report")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roleprofiletemplatename;
    private String roleprofiletemplatedescription;
    private String rightsassignedtorole;
    private String rightsdescription;
    private String rightsassignedyn;
    private String statusofroleprofiletemplatename;
    private String profileassignedto;
    private String typeofaccess;
}
