package com.improve10x.tdd.supriya.mathOperations;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public int multiple(int a, int b){
        if(a>0 && b>0){
            return a*b;
        }else if(a > 0){
            return b;
        }else if (b>0){
            return b;
        }
        return 1;
    }
    public int sub(int n, int m){
        if (n > 0 && m >0){
            return n-m;
        }
        if (n >0){
            return n;
        }if(m > 0){
            return -m;
        }
        return 0;
    }
}
