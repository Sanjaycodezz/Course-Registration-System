package com.example.CRS.controller;

import com.example.CRS.model.Cregistry;
import com.example.CRS.model.Users;
import com.example.CRS.service.Courseser;
import com.example.CRS.service.Userserv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:5500")
public class AdminCont {

    @Autowired
    Courseser crs;

    @GetMapping("course-enroll")
    public List<Cregistry> enrolledstudents() {
        return crs.enrolstu();
    }
    @Autowired
    Userserv uservi;

    @PostMapping("/add-user")
    public void adduser(@RequestBody Users user){
        uservi.adduser(user);

    }
}
