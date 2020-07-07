package com.david;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String getCustomerNumber;

    // this is a function
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    /*
    // i believe it works without the this keyword. I think dot this
    // is used in this case is because it add clarification to the field we will be using.
    // confirmed that it doesn't need this but if for syntax purpose and if you do
    // use it then you should always use this keyword.

    public void deposit(double depositAmount){
        balance += depositAmount;
    }*/
    public void withdrawl(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " Available. Withdrawl no processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawl of " + withdrawalAmount + " processed. remaining balance = " + this.balance);
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

   /* public Double getBalance() {
        return balance;
    }*/

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getGetCustomerNumber() {
        return getCustomerNumber;
    }

    public void setGetCustomerNumber(String getCustomerNumber) {
        this.getCustomerNumber = getCustomerNumber;
    }
}
