package com.improve10x.tdd.krishna;

public class StandardShipping extends Shipping{


    public StandardShipping(double price) {
        super("Standard Shipping ", price);
    }


    @Override
    public double calculateShippingCharges() {
        if(price < 50){
            return 10.50;
        }else if(price < 100){
            return 12;
        }else if(price < 200){
            return 13.50;
        }else {
            return 14.50;
        }
    }
}
