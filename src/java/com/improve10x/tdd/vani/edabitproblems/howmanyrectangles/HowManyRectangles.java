package com.improve10x.tdd.vani.edabitproblems.howmanyrectangles;

public class HowManyRectangles {
    public int rectangles(int n) {
        int rectangle ;
        int a = n;
        int b = n + 1;
        int total = a * b/2;
        rectangle = total * total;
        return rectangle;
    }
}
