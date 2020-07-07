package com.david;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*
    int value = 2;
    if (value == 1){
        System.out.println("value was 1");
    } else if (value == 2){
        System.out.println("value was 2");
    } else {
        System.out.println("was not 1 or 2");
    }

*/

    int switchValue = 3;

    switch(switchValue){
        // case = what we want to test
        case 1:
            System.out.println("value was 1");
            // break = to end the case statement
            break;

        case 2:
            System.out.println("value was 2");
            break;
        // default = for all other cases.
        default:
            System.out.println("was not 1 or 2");
            break;
    }


    }
}
