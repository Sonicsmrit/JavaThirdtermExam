package org.example;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
        }

        else if (age <= 12) {
            System.out.println("you are a Child.");
        }

        else if (age <= 19) {
            System.out.println("you are a Teen.");
        }

        else if (age <= 59) {
            System.out.println("You are an adult.");
        }

        else {
            System.out.println("You are a senior.");
        }


    }
}
