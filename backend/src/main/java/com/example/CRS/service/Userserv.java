package com.example.CRS.service;

import com.example.CRS.model.Users;
import com.example.CRS.repo.Userdetrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Userserv {
 BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder(12);
    @Autowired
    Userdetrepo udrepo;
    public void adduser(Users user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        udrepo.save(user);

    }
}
