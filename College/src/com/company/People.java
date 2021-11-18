package com.company;

public abstract class People {

    private String name, nationality;
    private int age;
    private char gender;

    public People(String name, String nationality, int age, char gender) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "}";
    }
}
