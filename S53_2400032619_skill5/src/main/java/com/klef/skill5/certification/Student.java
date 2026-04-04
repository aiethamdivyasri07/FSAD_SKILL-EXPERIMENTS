package com.klef.skill5.certification;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id = 32619;
    private String name = "DivyaSri";
    private String gender = "Female";

    @Autowired
    private Certification certification;

    public void displayStudent() {

        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Gender: " + gender);

        System.out.println("Certification Details:");
        certification.displayCertification();
    }
}