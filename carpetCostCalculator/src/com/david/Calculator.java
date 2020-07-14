package com.david;

public class Calculator {
    private Floor floor;
    private Carpet carpet;


    // constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }



    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }


    public Floor getFloor() {
        return floor;
    }

    public Carpet getCarpet() {
        return carpet;
    }









}
