package com.improve10x.tdd.vani.edabitproblems.addupthenumbers;

public class AddUpTheNumbers {
    public int addUp(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
