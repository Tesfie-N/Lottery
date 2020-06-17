package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner me = new Scanner(System.in);
        System.out.println("Enter your number to win a million dollar: ");
        int myNumber = me.nextInt();
        int randomNumber = (int) (Math.random() * 10);
        if (myNumber == randomNumber) {
            System.out.println("You have won 1000000");
        }
        else
            System.out.println("Sorry, U didn't win any thing now. Try again later !");

        System.out.println("Surprisingly,the random number was "+ randomNumber);
    }
}
