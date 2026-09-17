package com.example.CRS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Cregistry {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "creg_seq")
    @SequenceGenerator(
            name = "creg_seq",
            sequenceName = "CREG_SEQ",
            allocationSize = 1)
    private int id;

    private String coursename;
    private String emailid;
    private String name;

    public Cregistry(String coursename, String emailid, String name) {
        this.coursename = coursename;
        this.emailid = emailid;
        this.name = name;
    }

    public Cregistry() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;

    }
}