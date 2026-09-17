package com.example.CRS.repo;

import com.example.CRS.model.Cregistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cregrepo extends JpaRepository<Cregistry,Integer> {

}
