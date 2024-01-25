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
@Table(name = "adminreport")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminReport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	private String username;
	private String branchcode;
	private String branchname;
	private String profilename;
	private String activity;
	private String markeridmarkername;
	private String checkeridcheckername;
	private String markerdatetime;
	private String checkerdatetime;
	private String oldempname;
	private String newempname;
	private String oldprofilename;
	private String newprofilename;
	private String oldbranchname;
	private String newbranchname;
}
