package com.improve10x.tdd.supriya.arrayquestions.missingnumber;

public class MissingNumber {
    public int find(int[] numbers) {
        int result = -1;
        if (numbers != null&& numbers.length>=1 && numbers[0]!=0 ) {
//            if (numbers.length == 1) {
//                if (numbers[0] == 1) {
//                    return 2;
//                }
//                if (numbers[0] == 2) {
//                    return 1;
//                }
//            }
//            if (numbers.length == 2) {
//                if (numbers[0] == 1) {
//                    if (numbers[1] == 3) {
//                        return 2;
//                    }
//                }
//                if (numbers[1] == 2) {
//                    return 3;
//                }
//                if (numbers[0] == 2 && numbers[1] == 3) {
//                    return 1;
//                }
//            }
//            if (numbers.length == 3) {
//                if (numbers[0] == 1 && numbers[1] == 2 && numbers[2] == 3) {
//                    return 4;
//                }
//                if (numbers[0] == 1 && numbers[1] == 2 && numbers[2] == 4) {
//                    return 3;
//                }
//                if (numbers[0] == 1 && numbers[1] == 3 && numbers[2] == 4) {
//                    return 2;
//                }
//                if (numbers[0] == 2 && numbers[1] == 3 && numbers[2] == 4) {
//                    return 1;
//                }
//            }
//            if (numbers[0] == 1 && numbers[1] == 2 && numbers[2] == 3 && numbers[3] == 4) {
//                return 5;
//            }
            for (int i = 0; i < numbers.length; i++ ) {
                if (i + 1 != numbers[i]) {
                    result = i + 1;
                    break;
                } else {
                    result = numbers[i]+1;
                }
            }
            return result;
        }
        return-1;
    }
}


