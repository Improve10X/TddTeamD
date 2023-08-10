package com.improve10x.tdd.supriya.shipping;

public class StandardShipping extends Shipping{

    public StandardShipping(double price) {
        super("Standard Shipping", price);
    }

    @Override
    public double calculateShippingCharges() {
        if (price < 50){
            return 8.5;
        }else if (price < 100){
            return 10.95;
        }else if (price < 200){
            return 12.95;
        }else {
            return 13.95;
        }
    }
}
