package org.mysecurityproject.mysecureportfolio.Service;

import org.mysecurityproject.mysecureportfolio.Entity.UserPrincipal;
import org.mysecurityproject.mysecureportfolio.Entity.Users;
import org.mysecurityproject.mysecureportfolio.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepository.findByUsername(username);
        if(user == null){
            System.out.println("user not found");
            throw  new UsernameNotFoundException("User not found");
        }
        return new UserPrincipal(user);
    }
}
