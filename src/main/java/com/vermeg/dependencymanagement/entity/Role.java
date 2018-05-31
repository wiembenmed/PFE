package com.vermeg.dependencymanagement.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.vermeg.dependencymanagement.entity.UserAppRole;



@Entity
@Table(name = "role")
public class Role {
	
	
	@Id
	@Column(name="roleName")
    
    private String name;
   

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Role(Long id, String name) {
        
		this.name = name;
	}

	public Role() {}
    
	/*@OneToMany(mappedBy="roleName")
    
    private Collection<UserAppRole> user_roles;*/

   
}
