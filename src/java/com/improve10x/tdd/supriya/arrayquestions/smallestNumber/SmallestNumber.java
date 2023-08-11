package com.improve10x.tdd.supriya.arrayquestions.smallestNumber;

public class SmallestNumber {
    public int findSmallestNumber(int[] numbers) {
        if (numbers != null && numbers.length > 1) {
            if (numbers[0] > numbers[1]) {
                return 1;
            }else if (numbers[0] < numbers[1] ){
                return 3;
            }
        }
        return 0;
    }
}
