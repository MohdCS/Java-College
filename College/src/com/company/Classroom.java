package com.company;

import java.util.ArrayList;

public class Classroom {

    private String class_tag, location;
    private ArrayList<People> classroom;
    private static final int limit = 5;

    public Classroom(String class_tag, String location) {
        this.class_tag = class_tag;
        this.location = location;
        this.classroom = new ArrayList<People>();
    }

    public String getClass_tag() {
        return class_tag;
    }

    public String getLocation() {
        return location;
    }

    public void addPeople(People attendants){

        boolean attendance = true;

        for(People people: classroom){
            if(people.equals(attendants)){
                System.out.println("Unable to attend " + people.getName() + ": already attended " + getClass_tag() + ", location: " + getLocation() + "!");
                attendance = false;
                break;
            }
        }

        if(attendance){
            if(classroom.size() < limit){
                classroom.add(attendants);
                System.out.println(attendants.getName() + " has attended class " + getClass_tag() + ", location: " + getLocation() + "!");
            }
            else{
                System.out.println("Unable to attend " + attendants.getName() + " in " + getClass_tag() + ": class is full!");
            }
        }
    }

    public void removePeople(People attendants){
        boolean attendance = true;

        for(People people: classroom){
            if(people.equals(attendants)){
                classroom.remove(attendants);
                System.out.println(attendants.getName() + " has left class " + getClass_tag() + "!");
                attendance = false;
                break;
            }
        }

        if(attendance){
            System.out.println("Unable to remove " + attendants.getName() + " from class " + getClass_tag() + ": already left or does not exist!");
        }
    }

    @Override
    public String toString() {
        return "Class Tag: " + class_tag +
                ", Location: " + location +
                ", Classroom Attendants: " + classroom;
    }
}
