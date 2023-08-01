package com.improve10x.tdd.krishna.practice.practice;

public class HowManyRectangles {
    public int findNoOfRectangles(int num) { //(num (num + 1)/2)power2
       int noOfRectangles ;
       int n = num;
       int m = (num + 1);
       int total = (n * m)/2;
       noOfRectangles = total * total;
       return noOfRectangles;
    }
}
