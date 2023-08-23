package com.improve10x.tdd.supriya.arrayquestions.duplicateelement;

import java.util.ArrayList;

public class DuplicateElement {
    public int[] find(int[] numbers) {
        if (numbers != null && numbers.length >=1) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(numbers[0]);
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] != result.get(result.size() - 1)) {
                result.add(numbers[i]);
            }
        }
            int[] result1 = new int[result.size()];
            for (int i = 0; i < result1.length; i++) {
                result1[i] = result.get(i);
            }
            return result1;
        }
        return new int[]{};
    }
}


//            if (numbers.length == 1) {
//                return new int[]{numbers[0]};
//            }
//            if (numbers.length == 2) {
//                if (numbers[0] == numbers[1]) {
//                    return new int[]{numbers[0]};
//                }
//                return new int[]{numbers[0], numbers[1]};
//            }
//            if (numbers.length == 3) {
//                if (numbers[0] == numbers[1] && numbers[0] == numbers[2]){
//                    return new int[]{numbers[0]};
//                }
//                if (numbers[0] == numbers[1] || numbers[1] == numbers[2]) {
//                    return new int[]{numbers[0], numbers[2]};
//                }
//                return new int[]{numbers[0], numbers[1], numbers[2]};
//            }
//            if (numbers.length == 4) {
//                    if (numbers[0] == numbers[1]) {
//                        return new int[]{numbers[0], numbers[2], numbers[3]};
//                    }
//                    if (numbers[1] == numbers[2]){
//                        return new int[]{numbers[0], numbers[2], numbers[3]};
//                    }
//            }
//            if (numbers.length == 5) {
//                if (numbers[0] == numbers[1] && numbers[2] == numbers[3]) {
//                    return new int[]{numbers[1], numbers[3], numbers[4]};
//                }
//            }
//            if (numbers.length == 6) {
//                return new int[]{numbers[1], numbers[3], numbers[4]};
//            }
//        }
//        return new int[]{


