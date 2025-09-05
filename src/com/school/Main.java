package com.school;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].setDetails(101, "Alice");
        students[1] = new Student();
        students[1].setDetails(102, "Bob");

        Course[] courses = new Course[2];
        courses[0] = new Course();
        courses[0].setDetails(201, "Mathematics");
        courses[1] = new Course();
        courses[1].setDetails(202, "Computer Science");

        System.out.println("---- Students ----");
        for (Student s : students) {
            s.displayDetails();
        }

        System.out.println("---- Courses ----");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}
