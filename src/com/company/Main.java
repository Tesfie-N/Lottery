package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner me = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100 inclusive to win ten thousands dollar: ");
        int myNumber = me.nextInt();
        int randomNumber = (int) (Math.random() * 100);
        if (myNumber == randomNumber) {
            System.out.println("You have won 10000");
        }
        else
            System.out.println("Sorry, U didn't win any thing now. Try again later !");

        System.out.println("Surprisingly,the random number was "+ randomNumber);
    }
}
