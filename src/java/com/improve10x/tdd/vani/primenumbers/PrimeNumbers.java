package com.improve10x.tdd.vani.primenumbers;

public class PrimeNumbers {
//    public int calcPrimeNumbers(int number) {
//        int result = 0;
//        boolean hasFactors = false;
//        for (int i = 2; i <= number; i++) {
//            hasFactors = false;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    hasFactors = true;
//                    break;
//                }
//            }
//            if (hasFactors == false) {
//                result++;
//            }
//        }
//        return result;
//    }
        public int calcPrimeNumbers(int number) {
            int count = 0;
            if (number == -1){
                return -1;
            } else if (number >= 2) {
                for (int i = 2; i <= number; i++) {
                    if (isPrime(i)) {
                        count++;
                    }
                }
            }
            return count;
    }

    public boolean isPrime(int number) {
            if (number >= 2) {
                for (int i = 2; i <= number; i++) {
                    if (number % i != 0 || number == 2) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
    }
}

