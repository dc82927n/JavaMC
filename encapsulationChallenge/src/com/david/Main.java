package com.david;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // let test the printer class.

        // 1. let create an instance of Printer
        Printer printer = new Printer(99, true);
        // we created println that prints out the intials page count
        System.out.println("this is our printer toner Level " + printer.getPagesPrinted());
        //2. let now print we give the print pages values
        // two methods of doing this option 1 and then option 2 as you can see below
        int printPage = printer.printPages(5);
        // printer.printPages(5);
        // ** for the constructor parameters we need to getPages Printed and for the function
        // we can just use the dot notaiton.
        System.out.println("let print some pages " + printer.printPages(4) + " second print " + printPage);

    }
}
