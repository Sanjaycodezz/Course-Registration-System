package com.example.CRS;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class passwordhash {
    public static void main(String args[]){
        BCryptPasswordEncoder bpe=new BCryptPasswordEncoder(12);
        String pass="admin123";
        String hashcode=bpe.encode(pass);
        System.out.println(hashcode+":");

    }
}
