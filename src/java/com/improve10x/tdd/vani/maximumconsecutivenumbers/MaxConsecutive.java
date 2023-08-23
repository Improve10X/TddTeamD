package com.improve10x.tdd.vani.maximumconsecutivenumbers;

public class MaxConsecutive {
    public int find(int[] numbers) {
        if (numbers != null && numbers.length != 0) {
//            if (numbers.length == 2) {
//                if (numbers[0] == 1 || numbers[1] == 1) {
//                    return 1;
//                }
//            }
//            if (numbers.length == 3) {
//                if (numbers[1] == 1 && numbers[2] == 1) {
//                    return 2;
//                }
//                if (numbers[0] == 1 && numbers[2] == 1 || numbers[2] == 1 || numbers[0] == 1){
//                    return 1;
//                }
//            }
            int count = 0;
            int maximum = 0;
            for (int i = 0; i < numbers.length ; i++){
                if (numbers[i] == 1){
                    count++;
                }else {
                    count = 0;
                }
                maximum = Math.max(count,maximum);
            }
            return maximum;
        }
        return 0;
    }
}
