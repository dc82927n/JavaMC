package com.david;


// this enable us or extend to another class then we want to use extends keyword
// to be more percise we ware inheritance another class when using the extend keyword.

public class Dog extends Animal {
    // the reason we do this is because not all
    // animal have eyes but dog have eyes and not all animal
    // legs but does does, ect.
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;




    // we need a constructor that is calling the other constructor class.
   // public Dog(int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // what super is telling the constructor where it's extending from
        // in this case it's extending from the dog class.
      /*  super(1, 1, size, weight);
        // now we need to initilize the parameters we just added.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
*/


    public Dog(String name, int size, int weight, int eyes,
               int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");

    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }


    public void walk(){
        System.out.println("Dog.walk() called");
        // two ways to access move in the animal class
        // this is the recomand way to access move without the super.move
        // the reason this is better below because if you use the overRide method
        // it will overRide this move
        move(5);
        // or super.move()
    }


    public void run(){
        System.out.println("Dog.run() is called");
        move(10);
    }





}










