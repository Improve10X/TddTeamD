package com.improve10x.tdd.vani.practise.templerungameinheritance;

public class Player extends Character{
    private int score;

    public Player(String name, int health) {
        super(name, health);
        this.score = 0;
    }

    public void run (){
        System.out.println("Running.........");
    }

    public void jump(){
        System.out.println(getName() + " jumped to avoid obstacles!... ");
    }

    public int getScore() {
        return score;
    }

    public void collectCoins(Coin coin){
        System.out.println(" collected to coin value : " + coin.getValue());
        this.score += coin.getValue();
    }
}
