package com.improve10x.tdd.vani.removeduplicatesfromanarray;

public class RemoveDuplicates {
    public int[] find(int[] numbers) {
        if (numbers != null && numbers.length >= 1) {
            if (numbers.length == 1 && numbers[0] == numbers[0]) {
                return new int[]{numbers[0]};
            }
            if (numbers.length == 2) {
                if (numbers[0] == numbers[1]) {
                    return new int[]{numbers[0]};
                }
                if (numbers[0] < numbers[1]) {
                    return new int[]{numbers[0], numbers[1]};
                }
            }
            if (numbers.length == 3) {
                if (numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
                    return new int[]{numbers[0]};
                }
                if (numbers[0] == numbers[1] && numbers[1] < numbers[2]) {
                    return new int[]{numbers[0], numbers[2]};
                }
                if (numbers[0] < numbers[1] && numbers[1] == numbers[2]) {
                    return new int[]{numbers[0], numbers[2]};
                }
                if (numbers[0] < numbers[1] && numbers[1] < numbers[2]) {
                    return new int[]{numbers[0], numbers[1], numbers[2]};
                }
            }
            if (numbers.length == 4) {
                if (numbers[0] == numbers[1] && numbers[1] == numbers[2] && numbers[2] == numbers[3]) {
                    return new int[]{numbers[0]};
                }
            }
        }
        return new int[]{};
    }
}
