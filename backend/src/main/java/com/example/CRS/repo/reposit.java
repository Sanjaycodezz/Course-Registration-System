package com.example.CRS.repo;

import com.example.CRS.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reposit extends JpaRepository<Course,String> {

}
