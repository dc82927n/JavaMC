package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*

        Player player = new Player();
        // you can see we can access those fields in another class just by the follow:
        // that because in player we set the fields to public otherwise we can't access just the way we did

        player.name = "Tim";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("remaining health = " + player.healthRemaining());

        // so how encapsulation comes important for out program is because
        // we was easily able to change the player health below but maybe we don't want to have
        // access to the player health for example below.
        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("remaining health = " + player.healthRemaining());
*/

        EnhancedPlayer player = new EnhancedPlayer("tim", 50, "Sword");

        System.out.println("initial health = " + player.getHealth());






    }
}
