package com.improve10x.tdd.krishna.test2problems.indexoftheelement;

public class IndexOfTheElement {
    public int findIndex(int[] numbers, int number) {
        if (numbers != null) {
            for(int i = 0; i < numbers.length; i++){
                if(numbers[i] == number){
                    return i;
                }
            }
        }
        return -1;
    }
}
