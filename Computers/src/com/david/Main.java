package com.david;

public class Main {



    public static void main(String[] args) {
	// write your code here
        Dimension dimension = new Dimension(20,20,5);
        Case theCase = new Case("2229", "Dell", "240", dimension);

        // two ways we can write this instance
        // we created an instance of a class of resolution
        Resolution nativeResolution = new Resolution(2540, 1440);
        Monitor theMonitor = new Monitor("27 inch Beast ", "Acer  ", 27, nativeResolution);
        // or

        // this method you don't need to create an instance of a class.
        //  Monitor theMonitor = new Monitor("27 inch Beast ", "Acer  ", 27, new Resolution(2540, 1440));

        // how we able to access and invoke the object is first we need to create the instance and then

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red" );

        thePC.getMotherboard().loadPorgram("window 1.0");
        thePC.getTheCase().pressPowerButton();






    }
}
