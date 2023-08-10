package com.improve10x.tdd.krishna;

public class ExpressShipping extends Shipping{

    public ExpressShipping(String mode, double price) {
        super(mode, price);
    }

    @Override
    public double calculateShippingCharges() {
        if(price < 50){
            return 13.50;
        }else if(price < 100){
            return 15.50;
        }else if(price < 200){
            return 20.50;
        }else{
            return 23.50;
        }
    }
}
