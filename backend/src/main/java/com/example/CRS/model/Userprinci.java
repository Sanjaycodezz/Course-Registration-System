package com.example.CRS.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class Userprinci implements UserDetails {
  private Users use;

    public Userprinci(Users use) {
        this.use = use;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("ROLE_"+use.getRole()));
    }

    @Override
    public String getPassword() {
        return use.getPassword();
    }

    @Override
    public String getUsername() {
        return use.getUsername();
    }
}
