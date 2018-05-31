package com.vermeg.dependencymanagement.service;

import com.vermeg.dependencymanagement.entity.User;
import com.vermeg.dependencymanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

	private UserRepository userRepository;

	public UserService() {
	}

    //@Autowired
    public UserService(UserRepository userRepository) { 
      this.userRepository = userRepository;
    }
    
	public User findByEmail(String email) {
		//return userRepository.findByEmail(email);
		return null;
	}
	
	public User findByConfirmationToken(String string) {
		return userRepository.findByConfirmationToken(string);
	}
	
	public void saveUser(User user) {
		//userRepository.save(user);
	}

		
}