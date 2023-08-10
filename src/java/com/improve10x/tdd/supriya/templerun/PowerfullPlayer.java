package com.improve10x.tdd.supriya.templerun;

public class PowerfullPlayer extends Player {
    private String specialPowerType;
    private int specialPowerDuration;

    public PowerfullPlayer(Player player, String specialPowerType) {
        super(player.getName(), player.getHealth());
        this.setScore(player.getScore());
        this.specialPowerType = specialPowerType;
        specialPowerDuration = 0;
    }

    public void useSpecialPower() {
        if (specialPowerType != null && !specialPowerType.isEmpty()) {
            System.out.println(getName() + "has gained" + specialPowerType + "as special power.");
            if (specialPowerType.equals("Super speed")) {
                specialPowerDuration = 5;
            } else if (specialPowerType.equals("Invisibility")) {
                specialPowerDuration = 8;
            }
            System.out.println(getName() + "has activated the power" + specialPowerDuration + "duration");
        } else {
            System.out.println(getName() + "does not have any special power.");
        }
    }

    public void reduceSpecialPowerDuration() {
        if (specialPowerType != null && specialPowerDuration > 0 && specialPowerType.equals("Super speed")) {
            specialPowerDuration--;
            System.out.println(specialPowerType + "is active for another" + specialPowerDuration + "seconds");
        } else {
            specialPowerType = null;
            System.out.println(specialPowerType + "has ended for" + getName());
        }
    }

    @Override
    public void run() {
        if (specialPowerType != null && specialPowerType.equals("Super speed")) {
            System.out.println(getName() + "is running at super speed");
        } else {
            System.out.println(getName() + "is running at normal speed");
        }
    }
}
