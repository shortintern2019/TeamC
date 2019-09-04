package com.veagas.spotsearchapi.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface SpotRepository extends CrudRepository<SpotEntity, Integer> {

}
