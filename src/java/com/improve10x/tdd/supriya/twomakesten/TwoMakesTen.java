package com.improve10x.tdd.supriya.twomakesten;

public class TwoMakesTen {
    public boolean findStatus(int a,int b) {
        boolean result = false;
        if (a >= 0 && b >= 0){
            if ((a ==10 || b == 10) ||(a + b )==10 ){
                return true;
            }
        }
        return result;
    }
}
