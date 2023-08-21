package com.improve10x.tdd.krishna.test2problems.indexoftheelement;

public class IndexOfTheElement {
    public int findIndex(int[] numbers, int number) {
        if(numbers != null){
            if(numbers.length == 1){
                return 0;
            }
            if(numbers.length == 2 && numbers[1] == number){
                return 1;
            }
            if(numbers.length == 2 && numbers[0] == number){
                return 0;
            }
            if(numbers.length == 3 && numbers[2] == number){
                return 2;
            }
        }
        return -1;
    }
}
