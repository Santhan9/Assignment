package com.example.Assignment.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sId;
    private String sName;
    private String sEmail;
    private String sCourse;

    public long getsId() {
        return sId;
    }

    public Student(long sId, String sName, String sEmail, String sCourse) {
        this.sId = sId;
        this.sName = sName;
        this.sEmail = sEmail;
        this.sCourse = sCourse;
    }



    public String getsName() {
        return sName;
    }



    public String getsEmail() {
        return sEmail;
    }



    public String getsCourse() {
        return sCourse;
    }


}
