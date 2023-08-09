package com.improve10x.tdd.vani.inheritancetemplerun;

public class Fireball extends Obstacle{
    private int speed;

    public Fireball(int speed) {
        super("Moving FireBall", 30);
        this.speed = speed;
    }

    public void roll(){
        System.out.println(" The " + name  + " is rolling with the speed of " + damage + " mph ");
    }
}
