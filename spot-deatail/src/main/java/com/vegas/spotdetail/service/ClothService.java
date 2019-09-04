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
	private List<ClothEntity> recomendClothEntity;
	
	
	public List<ClothEntity> serchClothIdWithSpotId(Integer spotId, Integer userId) {
		List<ClothEntity> recomendClothEntity=new ArrayList<ClothEntity>() ;
		Optional<UserEntity> optEntity=userRepository.findById(userId);
		for(ClothSpotEntity clothSpotEntity:clothSpotRepository.findBySpotid(spotId)) {
			if(optEntity.isPresent()) {
			UserEntity userEntity=optEntity.get();
			recomendClothEntity.addAll(clothRepository.findByIdAndCdbodyAndCdheight(clothSpotEntity.getClothid(), userEntity.getBodyType(), userEntity.getHeightType()));
			}
		}
		return recomendClothEntity;
	}
}