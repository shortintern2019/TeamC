package com.veagas.spotsearchapi.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface SpotRepository extends CrudRepository<SpotEntity, Integer> {
    List<SpotEntity> findAllBySpotType(Integer spotType);
}
