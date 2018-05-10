package com.knight.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public boolean saveUser(UserInfo user) {
		
		userRepo.save(user);
		return true;
	}
	
	public List<UserInfo> retive() {
		
		return (List<UserInfo>) userRepo.findAll();
	}
	
	public UserInfo getByEmail(String email) {
		
		return userRepo.findByEmail(email);
	}

}
