package com.vegas.userapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.vegas.userapi.modeldto.User;
import com.vegas.userapi.repository.UserEntity;
import com.vegas.userapi.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	public void saveUserData(User user) {
		UserEntity userWithMaxId = new UserEntity();
		Optional<UserEntity> entityOpt = userRepository.findTopOrderByIdDesc();
		if(entityOpt.isPresent()){
			userWithMaxId = entityOpt.get();
		}
		UserEntity userentity = new UserEntity();
		userentity.setId(userWithMaxId.getId() + 1);
		userentity.setName(user.getName());
		userentity.setEmailAddress(user.getEmailAddress());
		userentity.setAge(user.getAge());
		userentity.setBodyType(user.getBodyType());
		userentity.setHeightType(user.getHeightType());
		userRepository.save(userentity);
	}
	
}