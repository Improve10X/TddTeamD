package com.improve10x.tdd.supriya.templerun;

public class Coin extends Obstacle {
    private int value;

    public Coin(int value){
        super("Coin",0);
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
