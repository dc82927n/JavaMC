package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        // going to print first input point 1 and default values of distance is 0,0
        // expected output is 7.81
        System.out.println("distance(0,0)= " + first.distance());
        // take the distance of first point parameter then take the second point to find the distance
        System.out.println("distance(second)= " + first.distance(second));
        // we are taking the first object parameter then taking the input we entered to fin the distance.
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        // we are creating an empty object that is calling distance passing in nothing which just be zeros.
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
        System.out.println(" sq" + Math.sqrt(61));
    }
}
