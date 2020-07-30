package com.david;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    boolean inManual;

    int currentGear = 0;

    public Car (String name, String size, int wheels, int doors, boolean inManual, int currentGear) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.inManual = inManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car set current() " + this.currentGear + "gear");
    }

    public void changeVelocity (int speed, int direction){
        move(speed, direction);
        System.out.println("changeVelocity: velocity " + speed  +  direction);
    }





}
