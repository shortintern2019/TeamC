package com.vegas.spotdetail.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.vegas.spotdetail.repository.ClothSpotEntity;

@Repository

public interface ClothSpotRepository extends CrudRepository<ClothSpotEntity, Integer> {
    List<ClothSpotEntity> findBySpotid( Integer spotId);
}