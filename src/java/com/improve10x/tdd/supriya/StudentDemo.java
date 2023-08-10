package com.improve10x.tdd.supriya;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new TopperStudent("Jhon","XA",65,99 );
        student.reading();
        if (student instanceof TopperStudent){
            ((TopperStudent)student).readQuickly();
        }
    }
}
