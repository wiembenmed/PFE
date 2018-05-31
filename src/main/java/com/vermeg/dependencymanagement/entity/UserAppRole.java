package com.vermeg.dependencymanagement.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.vermeg.dependencymanagement.entity.Application;
import com.vermeg.dependencymanagement.entity.Role;
import com.vermeg.dependencymanagement.entity.User;



//@Entity
@Table(name="user_app_role")
public class UserAppRole {

	
	@ManyToOne
	@JoinColumn (name="roleID")
	private Role role;
	
	@ManyToOne
	@JoinColumn (name="userID")
	private User user;
	
	@ManyToOne
	@JoinColumn (name="key")
	private Application app;
	
	
}
