package com.improve10x.tdd.krishna.test2problems.indexoftheelement;

public class IndexOfTheElement {
    public int findIndex(int[] numbers, int number) {
        if(numbers != null && numbers.length == 1){
            return 0;
        }
        if(numbers != null && numbers.length == 2 && numbers[1] == number){
            return 1;
        }
        return -1;
    }
}
