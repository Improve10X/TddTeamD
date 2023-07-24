package com.improve10x.tdd.supriya.practice.lessthan100;

public class LessThanHundred {
    public boolean findStatus(int n, int m) {
        boolean result = false;
        if (n + m <= 100){
            result = true;
        }
        return result;
    }
}
