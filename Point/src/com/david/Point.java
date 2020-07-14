package com.david;

public class Point {
    private int x;
    private int y;

    // method or function
    // a no agrument constructor
    public double distance (){
        System.out.println("message a");
        return distance (0,0);
    }

        // going to take point 1 and 2 then find the distance using distance formula
    public double distance(int a,int  b){
        System.out.println("message b");
        return Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));

    }

        // create a new object and just calling the defualt constructor and returning
        //it's value
    public double distance(Point z){
        System.out.println("message c");
        return distance(z.getX(),z.getY());
    }


    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }




}
