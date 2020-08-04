package com.david;

public class EnhancedPlayer {
    private String name;
    private int hitPoint = 100;
    private String weapon;


    // constructor
    public EnhancedPlayer(String name, int hitPoint, String weapon){
        this.name = name;

        if(hitPoint > 0 && hitPoint <= 100){
            this.hitPoint = hitPoint;
        }
        this.weapon = weapon;

    }


    public void loseHealth(int damage){
        this.hitPoint = this.hitPoint - damage;
        if(this.hitPoint <= 0){
            System.out.println("player knocked out");
            // reduce number of lives remaining for the player
        }

    }


    public int getHealth() {
        return hitPoint;
    }



}
