package com.improve10x.tdd.krishna.inheritance;

public class SpikePit extends Obstacles {
    private int width;

    public SpikePit(int width) {
        super("Spike pit ", 50);
        this.width = width;
    }

    public void trap(Character character) {
        System.out.println(name + " trapped " + character.getName() + " inside!. It is " + width + " meters wide");
        character.reduceHealth(damage);
    }
}
