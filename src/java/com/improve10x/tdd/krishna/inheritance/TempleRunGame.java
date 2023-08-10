package com.improve10x.tdd.krishna.inheritance;

import java.util.Random;

public class TempleRunGame {
    public static void main(String[] args) throws InterruptedException {
        Player player = new Player("Adventurer", 100);
        boolean isGameRunning = true;
        System.out.println("Welcome to Temple Run!");
        while (isGameRunning) {
            player = handleObstacle(player);
            player.run();
            if (player.getHealth() <= 0) {
                System.out.println("Game over! Your final score is : " + player.getScore());
                isGameRunning = false;
            } else if (player instanceof PowerfulPlayer) {
                ((PowerfulPlayer) player).reduceSpecialPowerDuration();
            }
            Thread.sleep(1000);
        }
    }

    private static Player handleObstacle(Player player) {
        Obstacles obstacles = generateRandomObstacle();
        if (obstacles instanceof Fireball) {
            ((Fireball) obstacles).roll();
            obstacles.colloid(player);
        } else if (obstacles instanceof SpikePit) {
            ((SpikePit) obstacles).trap(player);
        } else if (obstacles instanceof Coin) {
            Coin coin = ((Coin) obstacles);
            player.collectCoins(coin);
            if (coin.getValue() == 1000) {
                player = new PowerfulPlayer(player, "super speed");
                ((PowerfulPlayer) player).useSpecialPower();
            }
        }
        return player;
    }

    private static Obstacles generateRandomObstacle() {
        Random random = new Random();
        int obstacleType = random.nextInt(3);
        switch (obstacleType) {
            case 1:
                return new Fireball(random.nextInt(30) + 10);
            case 2:
                return new SpikePit(random.nextInt(10) + 5);
            default: {
                int[] coinValue = {10, 50, 1000};
                int randomIndexValue = random.nextInt(coinValue.length);
                return new Coin(coinValue[randomIndexValue]);
            }
        }
    }
}
