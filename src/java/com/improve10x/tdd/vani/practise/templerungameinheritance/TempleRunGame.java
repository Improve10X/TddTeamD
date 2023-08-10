package com.improve10x.tdd.vani.practise.templerungameinheritance;

import java.util.Random;

public class TempleRunGame {
    public static void main(String[] args) {
        Player player = new Player("Dimple", 100);
        int[] coinValues = {10,20,30,40,50};
        boolean isGameRunning = true;
        Random random = new Random();
        System.out.println("welcome to temple run!");
        while (isGameRunning){
            player.run();
            int obstacleType = random.nextInt(3);
            if (obstacleType == 1){
                FireBall fireBall = new FireBall(random.nextInt(30)+10);
                fireBall.roll();
                fireBall.collide(player);
            } else if (obstacleType == 2) {
                SpikePit spikePit = new SpikePit(random.nextInt(10)+5);
                spikePit.trap(player);
            } else {
                int randomIndexValue = random.nextInt(coinValues.length);
                Coin coin = new Coin(coinValues[randomIndexValue]);
                player.collectCoins(coin);
            }
            if (player.getHealth() <= 0){
                System.out.println(" Game over! the final score is " + player.getScore());
                isGameRunning = false;
            }
        }
        try {
            Thread.sleep(1000);
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
}
