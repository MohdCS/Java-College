package com.company;

public class Main {

    public static void main(String[] args) {
        Classroom classroom = new Classroom("C101", "West Wing");


        Tutor tutor = new Tutor("Mohammed", "Saudi", 34, 'M', "Java");
        Student student = new Student("Fahad", "Saudi", 20, 'M', "Computer Science", 1302);

        classroom.addPeople(tutor);
        classroom.addPeople(student);

        classroom.addPeople(tutor);
        classroom.addPeople(student);

        System.out.println(classroom.toString());

        System.out.println();

        classroom.removePeople(tutor);
        classroom.removePeople(student);

        classroom.removePeople(tutor);
        classroom.removePeople(student);

        System.out.println(classroom.toString());
    }
}


