package com.david;

public class Main {

    public static void main(String[] args) {
	 byte mybyte1 = 12;
	 short myshort1 = 25;
	 int myint1 = 10000;
	 long mylong1 = 50000 * ((mybyte1 + myshort1) + myint1);

        System.out.println(mylong1);
    }
}
