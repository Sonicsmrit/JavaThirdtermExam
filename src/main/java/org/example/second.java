package org.example;

import java.util.Scanner;

public class second{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int pin = 1234;

        int attempts = 0;

        while (attempts < 3) {

            System.out.print("Enter PIN: ");
            int userPin = scanner.nextInt();


            if (userPin == pin) {
                System.out.println("NIce you can withdraw your money now.");
                return;
            }

            else {
                attempts++;
                System.out.println("wrong pin try again: " + (3 - attempts) + " attempts left.");
            }
        }

        System.out.println("Account locked contact bank for support");
    }
}

