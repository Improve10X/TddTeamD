package com.improve10x.tdd.vani.inheritancetemplerun;

public class SpikePit extends Obstacle{
    private int width;

    public SpikePit(int width){
        super("Spike pit", 50);
        this.width = width;
    }

    public void trap(Character character){
        System.out.println(name + " trapped " + character.getName() + " inside!.it is " + width + " meters wide ");
        character.reduceHealth(damage);
    }
}
