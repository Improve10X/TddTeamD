package com.improve10x.tdd.vani.sortanarray;

public class SortAnArray {

    public int[] findSortArray(int[] numbers) {
       if (numbers != null && numbers.length > 1) {
               for (int i = 0; i < numbers.length - 1; i++) {
                   for (int j = i + 1; j < numbers.length; j++) {
                       if (numbers[i] > 3){
                           return new int[] {0};
                       } else if (numbers[i] > numbers[j]) {
                           int temp = numbers[i];
                           numbers[i] = numbers[j];
                           numbers[j] = temp;
                       }
                   }
               }
           return numbers;
       }
        return new int[]{0};
    }
}
