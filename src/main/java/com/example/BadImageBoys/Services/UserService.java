package com.example.BadImageBoys.Services;

import com.example.BadImageBoys.Models.User;
import com.example.BadImageBoys.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericService<User, Long> {

    @Autowired
    public UserService(UserRepository userRepository) {
        super(userRepository, User.class);
    }
}
