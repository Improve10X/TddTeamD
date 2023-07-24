package com.improve10x.tdd.vani.practise.arraycontainsagivennumber;

public class ArrayContainsAGivenNumber {
    public boolean check(int[] numbers, int number) {
        boolean result = false;
        for (int i =  0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                result = true;
            }
        }
        return result;
    }
}
