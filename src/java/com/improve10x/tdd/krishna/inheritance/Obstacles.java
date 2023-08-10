package com.improve10x.tdd.krishna.inheritance;

public class Obstacles {
    protected String name;
    protected int damage;

    public Obstacles(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void colloid(Character character){
        System.out.println(name + "has colloid with" + character.getName() + "and caused" + damage + "damage.");
        character.reduceHealth(damage);
    }
}
