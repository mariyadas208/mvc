package com.tcs.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;

	public void registerUser(User user) {
		repository.save(user);		
	}
	public boolean loginCheck(User user) {
		
		return repository.findByEmailAndPassword(user.getEmail(), user.getPassword())!=null;
	
}
	public boolean searchData(User user) {
		return repository.findByEmail(user.getEmail())!=null;
}
	
}