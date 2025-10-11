package com.school;

import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    private static final AtomicInteger nextStudentIdCounter = new AtomicInteger(1);
    private int studentId;
    private String name;

    public Student(String name) {
        this.studentId = nextStudentIdCounter.getAndIncrement();
        this.name = name;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}
