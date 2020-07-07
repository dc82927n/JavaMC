package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(12));

        }

        public static int sumDigits (int num){
            if (num < 10){
                return -1;
            }

            int sum = 0;

            while (num > 0){
                int digit = num % 10;
                sum += digit;


                num /= 10;
            }

            return sum;
    }



}
