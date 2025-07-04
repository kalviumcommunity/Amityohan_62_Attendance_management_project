package com.school;

public class Student {
    private static int nextStudentIdCounter=1; // Static counter for unique student IDs
    private int studentId;
    private String name;

    public Student(String name){
        this.studentId=nextStudentIdCounter++; // Assign unique ID
        this.name=name;

    }
    
    // public void setDetails(int id, String studentName) {
    //     this.studentId = id; // using 'this' for clarity
    //     this.name = studentName;
    // }

    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}