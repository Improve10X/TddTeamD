package com.improve10x.tdd.vani.practise.templerungameinheritance;

public class Coin extends Obstacles{
    private int value;

    public Coin(int value) {
        super("Coin", 0);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
