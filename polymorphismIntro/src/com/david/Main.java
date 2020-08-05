package com.david;



public class Movie(){
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot (){
        return "no plot here";
    }

}

public class Jaws extends Movie {
    public Jaws(String name) {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Shark attack";
    }


}

public class StarWars extends Movie {
    public StarWars(String name) {
        super("Starwars");
    }

    // creating a method that we will override the plot
    // i use the over method generator it created a return of super.plot
    @Override
    public String plot() {
        //return super.plot();
        return "A space adventure  ";
    }



}


public class TwentyEightDays extends Movie {
    public TwentyEightDays(String name) {
        super(name);
    }

    // creating a method that we will override the plot
    // i use the over method generator it created a return of super.plot
    @Override
    public String plot() {
        //return super.plot();
        return "Zombie movie ";
    }

}




public class Main {

    public static void main(String[] args) {
	// write your code here



    }


}
