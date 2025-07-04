package com.school;

public class Course {
    private static int courseIdCounter = 1; // Static counter for unique course IDs
    int courseId; // e.g., "CS101"
    String courseName;

    public Course(String courseName){
        this.courseId=courseIdCounter++; // Assign unique ID
        this.courseName=courseName;
    }

    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }

    // public void setDetails(int id, String cName) {
    //     this.courseId = id;
    //     this.courseName = cName;
    // }

    public void displayDetails() {
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.courseName);
    }
}