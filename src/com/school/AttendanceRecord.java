package com.school;

public class AttendanceRecord {
    private 
    int studentId;
    int courseId;
    String status;

    public AttendanceRecord(int studentId, int courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;
        
        if("Present".equalsIgnoreCase(status) || "Absent".equalsIgnoreCase(status)) { // equalIgnoreCase for case-insensitive comparison
            this.status = status;
        } else {
            this.status="Invalid";
            System.out.println("Invalid attendance status. Attendance record not created.");
        }
    }
    public int getStudentId(){
        return studentId;
    }    
    public int getCourseId(){
        return courseId;
    }
    public String getStatus(){
        return status;
    }
    
    public void displayDetails() {
        System.out.println("Attendance: Student ID:" +studentId + ", in Course ID " + this.courseId + ", Status: " + this.status);
    }
}
