package com.david;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    boolean inManual;

    int currentGear = 0;

    public Car (String name, String size, int wheels, int doors, int gears, boolean inManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.inManual = inManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car set current() " + this.currentGear + " gear");
    }

    public void changeVelocity (int speed, int direction){
        move(speed, direction);
        System.out.println("changeVelocity: velocity " + speed  +  direction);
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void setInManual(boolean inManual) {
        this.inManual = inManual;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
