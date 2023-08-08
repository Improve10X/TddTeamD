package com.improve10x.tdd.vani.practise.templerungameinheritance;

public class Obstacles {
    public String name;
    public int damage;

    public Obstacles(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void collide(Character character){
        System.out.println(name + " has collided " + character.getName() + " and caused " + damage + " damage. ");
        character.reduceHealth(damage);
    }
}
