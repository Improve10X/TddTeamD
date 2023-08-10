package com.improve10x.tdd.vani;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Intelligent(99);
        student.playGames();
        if (student instanceof Intelligent){
            ((Intelligent)student).dontWasteTime();
        } else if (student instanceof Daller) {
            ((Daller)student).dontSpendMoreTimeLearning();
        }



        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 1:
                    System.out.println("january");
                case 2:
                    System.out.println("february");
                case 3:
                    System.out.println("march");
                case 4:
                    System.out.println("April");
                case 5:
                    System.out.println("may");
                case 6:
                    System.out.println("june");
                default: {
                    System.out.println("no months here");
                }
            }
        }
    }
}
