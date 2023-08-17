package com.improve10x.tdd.supriya.arrayquestions.majority;

public class MajorityElement {
    public int findMajorityElement(int[] numbers) {
        if (numbers != null && numbers.length != 0) {
            int n = numbers.length;
            for (int i = 0; i < numbers.length; i++) {
                int count = 0;
                for (int j = i; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                    }
                }
                if (count > n / 2) {
                    return numbers[i];
                }
            }
        }
        return -1;
    }
//    public int[] find(int[] numbers) {
//        if (numbers != null && numbers.length != 0) {
//            int temp = numbers[0];
//            for(int i = 0; i <=numbers.length -2; i++ ){
//                numbers[i] = numbers[i + 1];
//            }
//            numbers[numbers.length -1] = temp;
//            return numbers;
//        }
//        return new int[]{};
//    }
}
