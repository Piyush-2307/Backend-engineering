package com.peeyu.demo.service;

import com.peeyu.demo.domain.User;
import com.peeyu.demo.enums.Gender;
import com.peeyu.demo.enums.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<User> getAllUser() {

        User user = new User();

        user.setId(1L);
        user.setUserName("Peeyu");
        user.setEmail("peeyu@Gmail.com");
        user.setFirstName("Peeyush");
        user.setLastName("Arora");
        user.setGender(Gender.Male);
        user.setRole(Role.ADMIN);

        return List.of(user);
    }

}
