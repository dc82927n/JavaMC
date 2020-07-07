package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PersonInfo person = new PersonInfo();

        person.setAge(12);
        System.out.println(person.getAge());

        person.setAge(18);
        System.out.println(person.isTeen());

        person.setFirstName("");
        person.setLastName("");
        System.out.println(person.getFullName());

    }
}
