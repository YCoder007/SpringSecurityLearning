package com.yash.projects.Spring.security.service;

import com.yash.projects.Spring.security.entity.Users;
import com.yash.projects.Spring.security.entity.UserPrincipal;
import com.yash.projects.Spring.security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MyUserDetialService implements UserDetailsService {


    @Autowired
    UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users users =userRepo.findByUsername(username);

        if (users == null){
            System.out.println(("UserNot found"));
            throw new UsernameNotFoundException("User not found");
        }

        return new UserPrincipal(users);
    }
}
