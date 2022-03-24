package com.relevel.services.booking.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExpertDetail {

//	 ExpertId INTEGER PRIMARY KEY,
//	    Expertise varchar(255),
//	    ExpertName varchar(255),
//	    ExpertMobile varchar(255),
//	    Status varchar(255) 
	
	@Id
     private String ExpertId;
     private String Expertise;
     private String ExpertName;
     private String ExpertMobile;
     private String Status;
     
	public String getExpertId() {
		return ExpertId;
	}
	public void setExpertId(String expertId) {
		ExpertId = expertId;
	}
	public String getExpertise() {
		return Expertise;
	}
	public void setExpertise(String expertise) {
		Expertise = expertise;
	}
	public String getExpertName() {
		return ExpertName;
	}
	public void setExpertName(String expertName) {
		ExpertName = expertName;
	}
	public String getExpertMobile() {
		return ExpertMobile;
	}
	public void setExpertMobile(String expertMobile) {
		ExpertMobile = expertMobile;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
     
     
     
}
