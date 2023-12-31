package com.improve10x.tdd.krishna.inheritance;

public class Fireball extends Obstacles {
    private int speed;

    public Fireball(int speed) {
        super("Moving Fireball ", 30);
        this.speed = speed;
    }

    public void roll() {
        System.out.println("The " + name + " is rolling with speed of " + speed + "mph.");
    }
}
