package com.improve10x.tdd.vani.practiseshipping;

public class StandardShipping extends Shipping{

    public StandardShipping(double price) {
        super("shipping charges", price);
    }

    @Override
    public double calculateShippingCharges() {
        if (price < 50) {
            return 8.50;
        } else if (price < 100) {
            return 10.95;
        } else if (price < 200) {
            return 12.95;
        } else {
            return 13.95;
        }
    }
}
