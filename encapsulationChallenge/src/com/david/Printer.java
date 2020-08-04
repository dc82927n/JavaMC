package com.david;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

        // created a constructor and we left out the pagesPrinted out because
        // we going to set the value to 0 inside the constructor
    public Printer(int tonerLevel, boolean duplex) {
       //  we want to check if the tonerLevel is not less than -1 and not greater than 1
        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            // we set it equal to -1 because that is the covention
            // that we have set the default value to show it's empty.
            this.tonerLevel = -1;
        }


        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    // we going to add a function that will add to the toner level
    public void addToner(int tonerAmount){
        // we need to check how we going to add toner
        


    }



}
