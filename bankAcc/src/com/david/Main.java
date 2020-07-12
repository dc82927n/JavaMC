package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Account bobsAccount = new Account("12345", 0.00, "bob b", "mymail",
            "number");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getGetCustomerNumber());

         bobsAccount.withdrawl(200.00);

         bobsAccount.deposit(50.00);
         bobsAccount.withdrawl(20.00);

        Account timAccount = new Account("239234", "some email" , "this is my name 9999");
        System.out.println(timAccount.getCustomerEmailAddress() + " name " + timAccount.getCustomerName() + " " + timAccount.getGetCustomerNumber());
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("bob",  123.00);
        System.out.println(person2.getName() + person2.getCreditLimit() + " " + person2.getEmailAddress());

        /*VipCustomer person3 = new VipCustomer(("tom", 500.00, "email@email.com"));
        System.out.println(person3.getName());*/

    }
}
