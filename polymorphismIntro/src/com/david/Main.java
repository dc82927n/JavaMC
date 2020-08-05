package com.david;


// the generic method that all the movies are going to extend from
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot (){
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}

// inheritence
class Jaws extends Movie {
    // when use the automatic constructor it assume that
    // it want use to use the default class parameter.
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Shark attack";
    }


}

class StarWars extends Movie {
    public StarWars() {
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


class IndependeceDay extends Movie {
    public IndependeceDay(){
        super("Independence day");
    }

    // overRide method that will return a String
    public String plot(){
        return "Alien attack earth ";
    }



}

class TwentyEightDays extends Movie {
    public TwentyEightDays() {
        super("TwentyEightDays");
    }

    // creating a method that we will override the plot
    // i use the over method generator it created a return of super.plot
    @Override
    public String plot() {
        //return super.plot();
        return "Zombie movie ";
    }

}

// we creating this just to demostrate a difference with
// if we was to use polymorphise and not
class ForgetMovie extends Movie {

    public ForgetMovie() {
        super("Forget Movie this will demostrate difference with" +
                " polymorphisem");
    }

    // no plot here because we going to demostrate what happen when we don't use polymorphism.




}




public class Main {

    public static void main(String[] args) {
	// write your code here
        // we going to create a forloop that that going to retrieve a random movie

        for(int i = 1; i < 11; i++){

            Movie movie = randomMovie();
            System.out.println("movie #" + i + " : " + movie.getName() + " \n" +
                    "plot " + movie.plot() + "\n");
        }


    }


    // **important we are returning the Class MOVIE so the super class of movie in this method
    // think of movie is a datatype so call the super for class that is going to take in
    // the movie parameter and return the given values.


    public static Movie randomMovie(){


        // creating a method Movie that will be a random movieGenerate.

        //Math.random();
        int randomNumber = (int) (Math.random() * 5) + 1;
        // we are multiplying random generate by  5 because it will produce a number between 1-4 and to
        // fix if we want a random number generate by 1-5 then we just add 1 like so
        // need to cast an int because by default it's random return a double. we can also see it if we
        // just type Math.ra and you will auto generate the selection with the dataTypes it returns.

        // let do a print to test our number generater is working
        System.out.println("Random number generator was: " + randomNumber);

        // lets create a switch statement
        // it will take in a random number and corrisponded.

        switch(randomNumber){
            case 1:
                return new Jaws();
             // normally you would see a break; underneath your switch statement
            // but we dont' have it because it because we are return it so
            // we dont need to break out of the cycle.

            case 2:
                return new IndependeceDay();

            case 3:
                return new StarWars();

            case 4:
                return new TwentyEightDays();

            case 5:
                return new ForgetMovie();

                // to check if we pass in a argument that is correct
            // but don't really need it because of our random number generator set up can't produce
            // number that is not between 1-4
            default:
                return null;

        }


        // option 2
        // we can put a return null; here and it would work the same. instead of the switch statement


    }



}
