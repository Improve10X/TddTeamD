package com.improve10x.tdd.krishna.equalityof3values;

public class EqualityOf3Values {

    public int findEqualityOf3Values(int num1, int num2, int num3){
        int result = 0;
        if((num1 == num2) && (num2 == num3) ){
            result = 3;
        }else if((num1 == num2) || (num1 == num3) || (num2 == num3)){
            result = 2;
        }
        return result;
    }
}
