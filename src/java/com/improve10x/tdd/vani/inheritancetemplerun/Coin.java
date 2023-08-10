package com.improve10x.tdd.vani.inheritancetemplerun;

public class Coin extends Obstacle{
    public int value;

    public Coin(int value){
        super("coin", 0);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
