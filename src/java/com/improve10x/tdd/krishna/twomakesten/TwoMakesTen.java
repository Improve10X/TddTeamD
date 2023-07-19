package com.improve10x.tdd.krishna.twomakesten;

public class TwoMakesTen {

    public boolean twoMakesTen(int num1, int num2){
        boolean  result = false;
        if(num1 >= 0 && num2 >= 0){
            if((num1 == 10 || num2 == 10) || (num1 + num2 == 10) ){
                result = true;
            }
        }
        return result;
    }
}
