package com.improve10x.tdd.supriya.practice.howmanyrectangles;

public class HowManyRectangles {
    public int findRectangles( int n) {
       int rectangles;
       int num = n;
       int m = n+1;
       int total = (num * m)/2;
       rectangles = total * total;
       return rectangles;
    }
}
