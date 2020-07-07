package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here

      /*  System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
*/

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.
        for (int i = 2 ; i < 9; i++ ){
            double result = calculateInterest(10000, i);4
            System.out.println(result);
        }


    }

    public static double calculateInterest (double amount, double interestRate){
        return (amount * (interestRate/100));
    }



}
