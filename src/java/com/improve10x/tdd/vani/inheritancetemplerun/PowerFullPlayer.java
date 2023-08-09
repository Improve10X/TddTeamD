package com.improve10x.tdd.vani.inheritancetemplerun;

public class PowerFullPlayer extends Player{
    private String specialPowerType;
    private int specialPowerDuration;
    public PowerFullPlayer (Player player, String  specialPowerType) {
        super(player.getName(), player.getHealth());
        this.setScore(player.getScore());
        this.specialPowerType = specialPowerType;
        specialPowerDuration = 0;
    }

    public void useSpecialPower(){
        if (specialPowerType != null && !specialPowerType.isEmpty()){
            System.out.println(getName() + " has gained " + specialPowerType + " as special power. ");
            if (specialPowerType.equals("super speed")){
                specialPowerDuration = 5;
            } else if (specialPowerType.equals("Invisibility")){
                specialPowerDuration = 8;
            }
            System.out.println(" has activated the power for " + specialPowerDuration + " duration. ");
        } else {
            System.out.println(getName() + " does not have any special power. ");
        }
    }

    public void reduceSpecialPowerDuration(){
        if (specialPowerType != null && specialPowerDuration > 0 && specialPowerType.equals("super speed")){
            specialPowerDuration--;
            System.out.println(specialPowerType + " is active for another" + specialPowerDuration + " seconds.");
        }else {
            specialPowerType = null;
            System.out.println(specialPowerType + " has ended " + getName());
        }
    }

    @Override
    public void run() {
        if (specialPowerType != null && specialPowerType.equals("super speed")){
            System.out.println(getName() + " is running at super speed");
        }else {
            System.out.println(getName() + " is running at normal speed");
        }
    }
}
