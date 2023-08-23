package com.improve10x.tdd.supriya.arrayquestions.countmaximum;

public class CountMaximumConsecutiveOnes {
    public int find(int[] numbers) {
        if (numbers != null && numbers.length >=1) {
//            if (numbers[0] ==1){
//                return 1;
//            }
            int count = 0;//101101
            for (int i = 0; i < numbers.length; i ++){
                if (numbers[i] == 1 ){
                    count++;
                }else {
                    count = 0;
                }
            }
            return count;
        }
        return 0;
    }
}
