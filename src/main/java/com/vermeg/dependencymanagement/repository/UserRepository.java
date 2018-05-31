package com.vermeg.dependencymanagement.repository;

import java.util.Set;


import org.springframework.stereotype.Repository;

import com.vermeg.dependencymanagement.entity.User;


@Repository("userRepository")
public interface UserRepository extends org.springframework.data.repository.CrudRepository<User, Long> {
    
	User findByEmail(String email);

	User findByUsername(String username);

	User findByConfirmationToken(String token);
	User getOne(Long id);


	public Set<String> getUserRolesByUsername(String username);
}
