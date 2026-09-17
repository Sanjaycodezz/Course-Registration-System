package com.example.CRS.repo;


import com.example.CRS.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userdetrepo extends JpaRepository<Users,Integer> {

    Users getByUsername(String username);
}
