package com.sivateja.springboot_unitesting.service;

import com.sivateja.springboot_unitesting.entity.UserEntity;
import com.sivateja.springboot_unitesting.model.User;
import com.sivateja.springboot_unitesting.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;

    public List<User> getUsers(){
        List<UserEntity> userEntities = userRepo.findAll();
        List<User> users = userEntities.stream()
                .map(userEntity -> new User(userEntity.getId(), userEntity.getName()))
                .collect(Collectors.toList());
        log.info("getUsers returned {}", users);
        return users;
    }
}
