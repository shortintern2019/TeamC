package com.vegas.spotapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaRepository extends CrudRepository<MediaEntity, Integer> {
    List<MediaEntity> findBySpotId(Integer spotId);
}
