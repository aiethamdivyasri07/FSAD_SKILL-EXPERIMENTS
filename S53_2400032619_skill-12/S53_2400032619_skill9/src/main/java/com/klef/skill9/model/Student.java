package com.klef.skill9.model;

public class Student {

    private long id;
    private String name;
    private String course;

    public Student(long id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}