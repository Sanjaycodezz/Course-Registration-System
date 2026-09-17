package com.example.CRS.service;

import com.example.CRS.model.Userprinci;
import com.example.CRS.model.Users;
import com.example.CRS.repo.Userdetrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class Myuserdetserv implements UserDetailsService {
    @Autowired
    Userdetrepo udrep;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Users user= udrep.getByUsername(username);
        if(user==null){
            throw new UsernameNotFoundException("Username Not Found");
        }
        return new Userprinci(user);
    }
}
