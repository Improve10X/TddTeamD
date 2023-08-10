package com.improve10x.tdd.krishna.problemsonswitch;

public class Student {
    public String name;
    public String className;
    public int rollNumber;
    public int marks;

    public Student(String name, String className, int rollNumber, int marks) {
        this.name = name;
        this.className = className;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}
