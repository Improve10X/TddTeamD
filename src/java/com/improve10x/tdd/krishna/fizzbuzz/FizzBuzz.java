package com.improve10x.tdd.krishna.fizzbuzz;

public class FizzBuzz {
    public String find(int n) {
        if(n > 0) {
            if (isDivisibleBy3and5(n)) {
                return "FizzBuzz";
            } else if (isDivisibleBy5(n)) {
                return "Buzz";
            } else if (isDivisibleBy3(n)) {
                return "Fizz";
            }
        }
        return String.valueOf(n);
    }

    private boolean isDivisibleBy3and5(int n) {
        return isDivisibleBy3(n) && isDivisibleBy5(n);
    }

    private boolean isDivisibleBy3(int n) {
        return n % 3 == 0;
    }

    private boolean isDivisibleBy5(int n) {
        return n % 5 == 0;
    }
}
