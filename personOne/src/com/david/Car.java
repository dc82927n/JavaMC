package com.david;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    /*
     * the big reason why we use encapsulation and why we store data this way it prevent thing to easily changed.
     * this way when we change data its done in this class vs
     * */
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("holden")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    // just created a method that can call the model else where

    public String getModel() {
        return model;
    }
}


