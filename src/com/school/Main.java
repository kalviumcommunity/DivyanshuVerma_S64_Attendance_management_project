package com.school;

import java.util.ArrayList;
import java.util.List;

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

        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(), courses[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students[1].getStudentId(), courses[0].getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(students[2].getStudentId(), courses[1].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students[3].getStudentId(), courses[2].getCourseId(), "Late"));

        System.out.println("---- Attendance Records ----");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
