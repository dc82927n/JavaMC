package com.david;

public class VipCustomer {
   private String name;
   private double creditLimit;
   private String emailAddress;

   public VipCustomer(){
        // we are setting the defaults for other contrutors we create.
       this("Defualt name", 50000.00, "defautl email");
   }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
