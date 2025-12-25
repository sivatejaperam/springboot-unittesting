package com.sivateja.springboot_unitesting.repo;

import com.sivateja.springboot_unitesting.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {

}
