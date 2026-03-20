package com.thinhreal.model_mapper.repository;

import com.thinhreal.model_mapper.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
