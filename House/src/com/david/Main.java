package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall Wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling (12, 55);

        Bed bed = new Bed ("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp ("classic", false, 75);

    }
}