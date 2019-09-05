package com.vegas.userapi.service;

import com.vegas.userapi.modeldto.User;
import com.vegas.userapi.repository.UserEntity;
import com.vegas.userapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	@Transactional
	public Integer saveUserData(User user) {
		UserEntity userWithMaxId = userRepository.findTopByOrderByIdDesc();
		Integer generateId;

		UserEntity userentity = new UserEntity();
		if(userWithMaxId==null) {
			userentity.setId(1);
			generateId = 1;
		}
		else {
			generateId = userWithMaxId.getId() + 1;
			userentity.setId(generateId);
		}
		userentity.setName(user.getName());
		userentity.setEmailAddress(user.getEmailAddress());
		userentity.setAge(user.getAge());
		userentity.setBodyType(user.getBodyType());
		userentity.setHeightType(user.getHeightType());
		userRepository.save(userentity);
		return generateId;
	}
	
}