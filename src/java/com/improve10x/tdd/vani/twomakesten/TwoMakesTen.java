package com.improve10x.tdd.vani.twomakesten;

public class TwoMakesTen {
    public boolean sumOfNumbers(int n1, int n2) {
        boolean result = false;
        if (n1 >= 0 && n2 >= 0) {
            if ((n1 == 10 || n2 == 10) || (n1 + n2 == 10)) {
                return true;
            }
        }
        return result;
    }
}
