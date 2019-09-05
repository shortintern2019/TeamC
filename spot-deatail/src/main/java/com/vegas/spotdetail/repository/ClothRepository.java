package com.vegas.spotdetail.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.vegas.spotdetail.repository.ClothEntity;

@Repository

public interface ClothRepository extends CrudRepository<ClothEntity, Integer> {
    List<ClothEntity> findByIdAndCdbodyAndCdheight(Integer id, Integer cdbody,Integer cdheight);
}