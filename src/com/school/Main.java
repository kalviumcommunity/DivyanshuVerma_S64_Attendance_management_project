package com.school;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[4];
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");
        students[2] = new Student("Charlie");
        students[3] = new Student("Diana");

        Course[] courses = new Course[3];
        courses[0] = new Course("Mathematics");
        courses[1] = new Course("Computer Science");
        courses[2] = new Course("Physics");

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
