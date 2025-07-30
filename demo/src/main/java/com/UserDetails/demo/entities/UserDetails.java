package com.UserDetails.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserDetails {

	@Id
  @GeneratedValue(strategy = GenerationType.AUTO)
	private long rowId;
	
	private String userId;
	
	private String userName;
	
	private String passWord;
	
	private String emailId;
	
	private String phoneNo;
	
	private String address;
}
