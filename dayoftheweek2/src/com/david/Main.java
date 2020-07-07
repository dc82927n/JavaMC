package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here

    printDayOfTheWeek(5);

    }

    public static void printDayOfTheWeek(int day){

        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3: case 4: case 5:
                System.out.println("can be wednesday, thursday, or friday");
            break;

            case 6: case 7:
                System.out.println("can be sat or sunday ");
            break;

            default:
                System.out.println("invalid");
        }

    }

}
