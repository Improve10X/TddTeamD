package com.improve10x.tdd.supriya.arrayquestions.practise1;

public class SecondLargestNumber {
    public int FindSecondLargestNumber(int[] numbers) {
        if (numbers != null && numbers.length>1) {
            for (int i = 0; i < numbers.length-1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            return numbers[numbers.length-2];
        }
        return 0;
    }
}


