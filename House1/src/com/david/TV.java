package com.david;

public class TV {
    private int screenSize;
    private Resolution resolution;

    public TV(int screenSize, Resolution resolution) {
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    public void turnOn(){
        System.out.println("tv is on");
    }



    public int getScreenSize() {
        return screenSize;
    }


    public Resolution getResolution() {
        return resolution;
    }
}
