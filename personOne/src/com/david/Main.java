package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here
     /*   personOne fullName = new personOne();

        fullName.setfirstName("hello ");
        fullName.setLastName("world");

        System.out.println(fullName.fullNameResult());

*/


        Car porsche = new Car();
        Car holden = new Car();
        /*
        * when you set something with this example we can't change the result.
        *
        * */
        porsche.setModel("Carrera");
        //porsche.setModel("911");


        System.out.println("Model is " + porsche.getModel());


    }
}
