package com.vegas.spotdetail.service;
import lombok.RequiredArgsConstructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.vegas.spotdetail.repository.ClothEntity;
import com.vegas.spotdetail.repository.ClothRepository;
import com.vegas.spotdetail.repository.ClothSpotEntity;
import com.vegas.spotdetail.repository.ClothSpotRepository;
import com.vegas.spotdetail.repository.UserEntity;
import com.vegas.spotdetail.repository.UserRepository;


@Service
@RequiredArgsConstructor
public class ClothService {
	private final ClothRepository clothRepository;
	private final ClothSpotRepository clothSpotRepository;
	private final UserRepository userRepository;
	
	
	public List<ClothEntity> searchClothIdWithSpotId(Integer spotId, Integer userId) {
		List<ClothEntity> recommendedClothEntity=new ArrayList<ClothEntity>() ;
		Optional<UserEntity> optEntity=userRepository.findById(userId);
		for(ClothSpotEntity clothSpotEntity:clothSpotRepository.findBySpotId(spotId)) {
			if(optEntity.isPresent()) {
			UserEntity userEntity=optEntity.get();
			recommendedClothEntity.addAll(clothRepository.findByIdAndCdbodyAndCdheight(clothSpotEntity.getClothId(), userEntity.getBodyType(), userEntity.getHeightType()));
			}
		}
		return recommendedClothEntity;
	}
}