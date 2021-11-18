package com.company;

public class Student extends People{

    private String specialization;
    private int section;

    public Student(String name, String nationality, int age, char gender, String specialization, int section) {
        super(name, nationality, age, gender);
        this.specialization = specialization;
        this.section = section;
    }
    public String getSpecialization() {
        return specialization;
    }

    public int getSection() {
        return section;
    }

    @Override
    public String toString() {
        return "[Student: " + super.toString() +
                ", Specialization: " + getSpecialization() +
                ", Section: " + getSection() + "]";
    }
}
