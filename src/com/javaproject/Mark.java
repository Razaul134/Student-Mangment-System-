//package com.javaproject;
//
//public class Mark {
//    private int id;
//    private int rollno;
//    private String subject;
//    private int coursecode;
//    private int marks;
//
//    // Getters and Setters
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//    public int getRollno() {
//        return rollno;
//    }
//    public void setRollno(int rollno) {
//        this.rollno = rollno;
//    }
//    public String getSubject() {
//        return subject;
//    }
//    public void setSubject(String subject) {
//        this.subject = subject;
//
//    }
//    public int getMarks() {
//        return marks;
//    }
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
//}
//
//

package com.javaproject;

public class Mark {
//    private int id;
    private int rollno;
    private int courseCode;
    private String subject;
    private int marks;

    // Getters and setters

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
