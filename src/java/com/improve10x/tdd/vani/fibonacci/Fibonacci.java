package com.improve10x.tdd.vani.fibonacci;

public class Fibonacci {
    public int findNthFibonacci(int n) {
        if (n <= 0) {
            return -1;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return findNthFibonacci(n - 1) + findNthFibonacci(n - 2);
        }
    }
}
