package com.school;

import java.util.concurrent.atomic.AtomicInteger;

public class Course {
    private static final AtomicInteger nextCourseIdCounter = new AtomicInteger(101);
    private int courseId;
    private String courseName;

    public Course(String courseName) {
        this.courseId = nextCourseIdCounter.getAndIncrement();
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayDetails() {
        System.out.println("Course ID: C" + this.courseId + ", Course Name: " + this.courseName);
    }
}
