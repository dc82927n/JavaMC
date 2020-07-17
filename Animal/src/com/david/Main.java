package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // this example how we can use how we can use how some of these work
        // this initializing a animal
        Animal animal = new Animal ("Animal",1,1,5,5);


        // now we going to initialize a dog
        Dog dog = new Dog("Yokkie", 8, 20, 2, 4, 1, 2, "gold" );
        // this is an example we are able to use the eat class even though ti's not part of the dog class.
        // the reason for this is because we use extends animal to dog class
        dog.eat();
        dog.walk();
        dog.run();





    }
}
