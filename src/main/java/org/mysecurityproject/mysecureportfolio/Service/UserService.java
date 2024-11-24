package org.mysecurityproject.mysecureportfolio.Service;

import org.mysecurityproject.mysecureportfolio.Entity.Users;
import org.mysecurityproject.mysecureportfolio.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users registerUser(Users user) {
       return userRepository.save(user);

    }
}
