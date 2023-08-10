package com.improve10x.tdd.supriya;

public class Student {


    protected String name;
    protected String className;
    protected int marks;

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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(String name, String className, int marks) {
        this.name = name;
        this.className = className;
        this.marks = marks;
    }

    public void reading(){
        System.out.println("reading..");
    }

    public void writing(){
        System.out.println("writing..");
    }
}
