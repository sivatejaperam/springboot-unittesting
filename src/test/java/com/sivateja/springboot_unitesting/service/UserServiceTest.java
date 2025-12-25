package com.sivateja.springboot_unitesting.service;

import com.sivateja.springboot_unitesting.entity.UserEntity;
import com.sivateja.springboot_unitesting.model.User;
import com.sivateja.springboot_unitesting.repo.UserRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepo userRepo;

    @InjectMocks
    private UserService userService;

    @Test
    void shouldReturnUsers(){
        List<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity(1L, "Alice"));
        userEntities.add(new UserEntity(2L, "Bob"));

        when(userRepo.findAll()).thenReturn(userEntities);

        List<User> users = userService.getUsers();

        Assertions.assertEquals(2, users.size());
        Assertions.assertEquals("Alice", users.get(0).getName());
    }
}
