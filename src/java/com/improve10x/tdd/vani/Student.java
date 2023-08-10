package com.improve10x.tdd.vani;

public class Student {
    public String name;
    public int marks;
    public String className;

    public Student(String name, int marks, String className) {
        this.name = name;
        this.marks = marks;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void learn(){}
    public void write(){}
    public void copy(){}
    public void playGames(){
        System.out.println("playing games..........");
    }
    public void shouting(){}

}
