package com.improve10x.tdd.krishna.addupnumbersfromasinglenumber;

public class AddUpNumbersFromASingleNumber {

    public int addUpNumbersToNumber(int number){
        int sum = 0;
        sum = getSum(number, sum);
        return sum;
    }

    private static int getSum(int number, int sum) {
        for(int i = 0; i <= number; i++){
            sum = sum + i;
        }
        return sum;
    }
}
