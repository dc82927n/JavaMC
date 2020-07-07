package com.david;

public class Main {

    public static void main(String[] args) {
        // write your code here

        personInfo fullName = new personInfo();

        fullName.setfirstName("hello ");
        fullName.setLastName("world");

        System.out.println(fullName.fullNameResult());
    }

        public  class personInfo {
            public String firstName;
            public String lastName;


            public void setfirstName(String firstName) {
                this.firstName = firstName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String getfirstName() {
                return this.firstName;
            }

            public String getlastName() {
                return this.lastName;
            }

            public String fullNameResult() {
                return this.firstName + this.lastName;
            }
        }



}
