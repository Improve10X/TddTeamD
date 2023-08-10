package com.improve10x.tdd.supriya;

public class TopperStudent extends Student{
   protected int topMarks;

    public TopperStudent(String name, String className, int marks, int topMarks) {
        super(name, className, marks);
        this.topMarks = topMarks;
    }
//    public TopperStudent(Student student,int topMarks) {
//        super(student.getName(), student.getClassName(), student.getMarks());
//        this.topMarks = topMarks;
//    }

    public void readQuickly(){
        System.out.println(getName()+"Reading Quickly marks is :"+topMarks);
    }

    public void learnedQuickly(){
        System.out.println(getName()+"learned Quickly"+getMarks());
    }
}
