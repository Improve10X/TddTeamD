package com.improve10x.tdd.supriya.templerun;

import java.util.Random;

public class TempleRunGame {
    public static void main(String[] args) throws InterruptedException {
        Player player = new Player("Adventurer", 100);
        boolean isGameRunning = true;
        System.out.println("Welcome To Temple Run!");
        while (isGameRunning) {
            player = handleObstacle(player);
            player.run();
            if (player.getHealth() <= 0) {
                System.out.println("Game over!Your final score is :" + player.getScore());
                isGameRunning = false;
            } else if (player instanceof PowerfullPlayer) {
                ((PowerfullPlayer) player).reduceSpecialPowerDuration();
            }
            Thread.sleep(1000);
        }
    }

    private static Player handleObstacle(Player player) {
        Obstacle obstacle = generateRandomObstacle();
        if (obstacle instanceof FireBall) {
            ((FireBall) obstacle).roll();
            obstacle.collide(player);
        } else if (obstacle instanceof SpikePit) {
            ((SpikePit) obstacle).trap(player);
        } else if (obstacle instanceof Coin) {
            Coin coin = ((Coin) obstacle);
            player.collectCoins(coin);
            if (coin.getValue() == 1000) {
                player = new PowerfullPlayer(player, "Super speed");
                ((PowerfullPlayer) player).useSpecialPower();
            }
        }
        return player;
    }

    private static Obstacle generateRandomObstacle() {
        Random random = new Random();
        int obstacleType = random.nextInt(3);
        switch (obstacleType) {
            case 1:
                return new FireBall(random.nextInt(30) + 10);
            case 2:
                return new SpikePit(random.nextInt(10) + 5);
            default: {
                int[] coinValues = {10, 50, 1000};
                int randomIndexValue = random.nextInt(coinValues.length);
                return new Coin(coinValues[randomIndexValue]);
            }
        }
    }
}


