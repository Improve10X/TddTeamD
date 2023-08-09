package com.improve10x.tdd.vani.practise.templerungameinheritance;

public class FireBall extends Obstacles{
    private int speed;

    public FireBall (int speed){
        super("Moving ball", 30);
        this.speed = speed;
    }

    public void roll(){
        System.out.println(" The " + name + " is rolling with speed of " + speed + " mph. ");
    }
}
