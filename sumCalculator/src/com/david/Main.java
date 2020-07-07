package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here


/*    SumCalculator add = new SumCalculator();
    SumCalculator subtract = new SumCalculator();

    add.setSecondNumber(3);
    add.setFirstNumber(5);

    subtract.setFirstNumber(9);
    subtract.setSecondNumber(5);

    System.out.println(add.getAdditionReslut());
    System.out.println(subtract.getSubtractionResult());*/

   SumCalculator calculator = new SumCalculator();

   calculator.setFirstNumber(10);
   calculator.setSecondNumber(7);

       System.out.println("add = " + calculator.getAdditionReslut());
       System.out.println(("subtraction = "  + calculator.getSubtractionResult()));

   calculator.setFirstNumber(10);
   calculator.setSecondNumber(2);

        System.out.println("mult = " + calculator.getMultipicationResult());
        System.out.println("div = " + calculator.getDivisionResult());

    }
}
