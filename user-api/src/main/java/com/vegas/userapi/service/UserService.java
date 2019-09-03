package com.vegas.userapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vegas.userapi.modeldto.User;
import com.vegas.userapi.repository.UserEntity;
import com.vegas.userapi.repository.UserRepository;

@Service

public class UserService {
	@Autowired
	UserRepository userRepository;
	public void saveUserData(User user) {
		UserEntity userentity=new UserEntity();
		userentity.setName(user.getName());
		userentity.setEmailAddress(user.getEmailAddress());
		userentity.setAge(user.getAge());
		userentity.setBodyType(user.getBodyType());
		userentity.setHeightType(user.getHeightType());
		useRepository.save();
	}
	
}