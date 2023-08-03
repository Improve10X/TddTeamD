package com.improve10x.tdd.vani.practiseshipping;

public class ExpressShipping extends Shipping{

    public ExpressShipping(double price) {
        super("express shipping", price);
    }

    @Override
    public double calculateShippingCharges() {
        if (price < 50){
            return 23.90;
        } else if (price < 100) {
            return 25.95;
        } else if (price < 200) {
            return 27.95;
        }else {
            return 28.95;
        }
    }
}
