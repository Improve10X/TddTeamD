package com.improve10x.tdd.vani.inheritancetemplerun;

import java.util.Random;

public class TempleRunGame {
    public static void main(String[] args) throws InterruptedException {
        Player player = new Player("adventurer", 100);
        boolean isGameRunning = true;
        System.out.println("welcome to temple run!");
        while (isGameRunning){
            player = handleObstacle(player);
            player.run();
            if (player.getHealth() <= 0){
                System.out.println("Game over! your final score is" + player.getScore());
                isGameRunning = false;
            } else if (player instanceof PowerFullPlayer) {
                ((PowerFullPlayer) player).reduceSpecialPowerDuration();
            }
            Thread.sleep(1000);
        }
    }

    private static Player handleObstacle(Player player) {
        Obstacle obstacle = generateRandomObstacle();
        if (obstacle instanceof Fireball){
            ((Fireball) obstacle).roll();
            obstacle.collide(player);
        } else if (obstacle instanceof SpikePit) {
            ((SpikePit) obstacle).trap(player);
        } else if (obstacle instanceof Coin) {
           player.collectCoins((Coin) obstacle);
           if (((Coin) obstacle).getValue() == 1000){
               player = new PowerFullPlayer(player,"super speed");
               ((PowerFullPlayer)player).useSpecialPower();
           }
        }
        return player;
    }




    private static Obstacle generateRandomObstacle() {
        Random random = new Random();
        int obstacleType = random.nextInt(3);
        switch (obstacleType){
            case 1 : return new Fireball (random.nextInt(30)+10);
            case 2 : return new SpikePit(random.nextInt(10) + 5);
            default : {
                int[] coinValues = {10,50,1000};
                int randomIndexValue = random.nextInt(coinValues.length);
                return new Coin(coinValues[randomIndexValue]);
            }
        }
    }
}
