package com.david;

public class Floor {
    private double width;
    private double length;

    // function
    public double getArea() {
        return width * length;
    }

    //constructor
    public Floor (double width, double length){
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if(length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }


    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
