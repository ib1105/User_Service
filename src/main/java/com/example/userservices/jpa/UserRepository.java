package com.example.userservices.jpa;

import org.springframework.data.repository.CrudRepository;

// CrudRepository<연동 될 entity, entity의 기본키 타입>
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByUserId(String userId);

}