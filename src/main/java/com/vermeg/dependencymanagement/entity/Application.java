package com.vermeg.dependencymanagement.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.vermeg.dependencymanagement.entity.UserAppRole;


@Entity
@Table(name = "application")
public class Application {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appID")
	private Long id;
	
	 @Column(name="appAdmin")
	private String admin;
	 @Column(name = "appName")
	 private String name;

	public Application(String admin, String name) {
		this.admin = admin;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin= admin;
	}



	public Application() {}
	 
	/* @OneToMany(mappedBy="key")
     private Collection<UserAppRole> user_roles;*/
}
