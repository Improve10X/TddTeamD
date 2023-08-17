package com.improve10x.tdd.vani.leftrotatethearraybyone;

public class LeftRotate {
    public int[] findLeftRotateByArray(int[] numbers) {
        if (numbers != null && numbers.length != 0) {
//            if (numbers.length == 1) {
//                return new int[]{numbers[0]};
//            }
//            if (numbers.length == 2) {
//                int temp = numbers[0];
//                numbers[0] = numbers[1];
//                numbers[1] = temp;
//                return new int[]{numbers[0], numbers[1]};
//            }
//            if (numbers.length == 3){// length 3 - 1 = 2 // length 4 - 2 = 2
//                int temp = numbers[0];
//                numbers[0] = numbers[1];
//                numbers[1] = numbers[2];
//                numbers[2] = temp;
//                return new int[]{numbers[0],numbers[1],numbers[2]};
//            }
            int temp = numbers[0];
            for (int i = 0; i <= numbers.length - 2; i++){
               numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = temp;
            return numbers;
        }
        return new int[]{};
        }
    }



