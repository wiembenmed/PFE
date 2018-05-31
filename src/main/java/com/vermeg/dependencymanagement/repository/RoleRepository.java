package com.vermeg.dependencymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vermeg.dependencymanagement.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

}
