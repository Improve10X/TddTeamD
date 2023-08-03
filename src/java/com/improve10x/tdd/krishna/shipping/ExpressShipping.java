package com.improve10x.tdd.krishna.shipping;

public class ExpressShipping extends Shipping{
    public ExpressShipping(double price) {
        super("Express Shipping ", price);
    }

    @Override
    public double calculateShippingCharges() {
        if(price < 50){
            return 23.50;
        }else if(price < 100){
            return 25.95;
        }else if(price < 200){
            return 27.95;
        }else {
            return 28.95;
        }
    }
}
