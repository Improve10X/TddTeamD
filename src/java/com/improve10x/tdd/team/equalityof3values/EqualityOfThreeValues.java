package com.improve10x.tdd.team.equalityof3values;

public class EqualityOfThreeValues {

    public int findEquality(int number1, int number2, int number3){
        int equality = 0;
        if(number1 == number2 && number2 == number3){
            equality = 3;
        }else if(number1 == number2 || number1 == number3 || number2 == number3){
            equality = 2;
        }
        return equality;
    }
}
