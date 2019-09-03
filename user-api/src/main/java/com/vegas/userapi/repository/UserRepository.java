package com.vegas.userapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    UserEntity findTopByOrderByIdDesc();
}
