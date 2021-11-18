package com.company;

public class Tutor extends People {

    private String course;

    public Tutor(String name, String nationality, int age, char gender, String course) {
        super(name, nationality, age, gender);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Tutor: " + super.toString() +
                ", Course: " + getCourse();
    }
}
