package com.klef.skill5.certification;



import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id = 101;
    private String name = "Spring Boot Certification";
    private String dateOfCompletion = "10-03-2026";

    public void displayCertification() {
        System.out.println("Certification ID: " + id);
        System.out.println("Certification Name: " + name);
        System.out.println("Completion Date: " + dateOfCompletion);
    }
}