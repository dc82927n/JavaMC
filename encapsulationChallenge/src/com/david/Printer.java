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

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    // we going to add a function that will add to the toner level
    public int addToner (int tonerAmount) {
        // we need to check how we going to add toner but first less check if
        // the total amount is less or greater than total amount.
        if(tonerAmount > 0 && tonerAmount <= 100){
            // first we want to check if th toner is between 0 and 100
            // if it is then we want to check if the current toner level
            // + the toner amount we are adding is greater than 100
            // if it is then we want to return -1
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
                // the reason for this is we basically say if all the
                // condition is meet then we add the toner amount with the tonerLevel
                // and return the tonerlevel.
                // same as this.tonerLevel += tonerAmount.
                this.tonerLevel = tonerLevel + tonerAmount;
                return this.tonerLevel;
            } else {
            // convetion if we return an error.
            return -1;
        }

    }

     // creating a function that will determine how many pages from duplex mode
    public int printPages (int pages){
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("printing in duplex mode");
        }
        // not sure why we need this . can we just return pagesTo print?
        // he says we need to update the pagesPrinted.
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;



    }


    // then we going to add a getter for the pagesPrinted to make sure it's correct
    // why we are not adding getters for everything? 

    public int getPagesPrinted() {
        return pagesPrinted;
    }


}
