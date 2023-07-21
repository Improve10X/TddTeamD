package com.improve10x.tdd.team.addupthenumbers;

public class AddUpTheNumbers {
    public int addUp(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
