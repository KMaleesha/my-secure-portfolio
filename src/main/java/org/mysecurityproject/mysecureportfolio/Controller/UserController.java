package org.mysecurityproject.mysecureportfolio.Controller;

import org.mysecurityproject.mysecureportfolio.Entity.Users;
import org.mysecurityproject.mysecureportfolio.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return userService.registerUser(user);
    }

    @PostMapping("/user-login")
    public String login(@RequestBody Users user) {
        return userService.verify(user);
    }
}
