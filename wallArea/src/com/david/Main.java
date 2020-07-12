package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // creating an obj and setting the parameters
        Wall wall = new Wall (5,4);
        System.out.println("area= " + wall.getArea());

        // now resetting the parameters by using a setter
        wall.setHeight(-1.5);
        System.out.println("height = " + wall.getHeight());

        System.out.println("width= " + wall.getWidth());
        System.out.println("area " + wall.getArea());

    }
}
