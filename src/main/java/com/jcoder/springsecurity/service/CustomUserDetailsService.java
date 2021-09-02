package com.jcoder.springsecurity.service;

import com.jcoder.springsecurity.vo.CustomUserDetails;
import com.jcoder.springsecurity.entity.User;
import com.jcoder.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user =  userRepository.findByUsername(s);
        if(user==null)
            throw new UsernameNotFoundException(String.format("User %s not found !!!",s) );
        //now we need to transform user to UserDetails i.e interface

        UserDetails userDetails  = new CustomUserDetails(user) ;

        return userDetails;
    }
}
