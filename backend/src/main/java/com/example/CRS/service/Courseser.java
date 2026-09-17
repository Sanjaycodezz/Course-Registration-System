package com.example.CRS.service;

import com.example.CRS.model.Course;
import com.example.CRS.model.Cregistry;
import com.example.CRS.repo.cregrepo;
import com.example.CRS.repo.reposit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Courseser {
    @Autowired
    reposit rep;
    @Autowired
    cregrepo crp;

    public List<Course> Availablecrs() {
        return rep.findAll();

    }

    public List<Cregistry> enrolstu() {
        return crp.findAll();
    }

    public void crenrol(String coursename, String emailid, String name) {
        Cregistry crrp=new Cregistry(coursename,emailid,name);
         crp.save(crrp);
    }
}
