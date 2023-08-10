package com.improve10x.tdd.supriya.templerun;

public class FireBall extends Obstacle {
    private int speed;

    public FireBall(int speed){
        super("Moving Fireball", 30);
        this.speed = speed;
    }

    public void roll(){
        System.out.println("The"+name+" is rolling with speed of"+speed+ "mph.");
    }
}
