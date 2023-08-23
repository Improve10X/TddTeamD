package com.improve10x.tdd.vani.edabitproblems.equalityof3values;

public class EqualityOf3Values {
    public int equal(int a, int b, int c) {
        int result = 0;
        if (a == b && b== c){
            result = 3;
        } else if (a == b || b == c || a == c) {
            result = 2;
        }
        return result;
    }
}
