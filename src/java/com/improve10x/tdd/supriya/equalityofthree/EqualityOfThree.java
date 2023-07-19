package com.improve10x.tdd.supriya.equalityofthree;

public class EqualityOfThree {
    public int findValue(int a, int b, int c) {
        int result = 0;
        if (a == b && a == c) {
            result += 3;

        }
        if (a == b || b == c || a == c) {
            result += 2;
        }
        return result;
    }
}
