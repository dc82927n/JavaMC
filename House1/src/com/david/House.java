package com.david;

public class House {
    private int sofaSize;
    private int tvSize;
    private int chairs;
    private boolean lightSwitch;

    public House(int sofaSize, int tvSize, int chairs, boolean lightSwitch) {
        this.sofaSize = sofaSize;
        this.tvSize = tvSize;
        this.chairs = chairs;
        this.lightSwitch = lightSwitch;
    }

    public int getSofaSize() {
        return sofaSize;
    }

    public int getTvSize() {
        return tvSize;
    }

    public int getChairs() {
        return chairs;
    }

    public boolean isLightSwitch() {
        return lightSwitch;
    }




}
