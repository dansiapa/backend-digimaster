package com.rangga.backend;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_person") 
public class PersonModel {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id") 
	private int personId;
	@Column(name = "person_name") 
	private String personName;
	@Column(name = "person_email") 
	private String personEmail;
	@Column(name = "person_password")
	private String personPassword;
	@Column(name = "person_dob")
	private String personDob;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonEmail() {
		return personEmail;
	}
	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}
	public String getPersonPassword() {
		return personPassword;
	}
	public void setPersonPassword(String personPassword) {
		this.personPassword = personPassword;
	}
	public String getPersonDob() {
		return personDob;
	}
	public void setPersonDob(String personDob) {
		this.personDob = personDob;
	}
	
	
}
