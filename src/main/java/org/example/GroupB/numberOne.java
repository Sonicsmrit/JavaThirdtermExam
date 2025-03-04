package org.example.GroupB;

import java.util.ArrayList;
import java.util.Scanner;

public class numberOne{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salaries = new ArrayList<>();


        System.out.println("enter salaries of 5 employees:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Salary " + (i + 1) + ": ");
            salaries.add(scanner.nextDouble());
        }


        double sum = 0;

        for (Double salary : salaries) {
            sum = sum + salary;
        }

        double avg = sum / salaries.size();

        if (avg < 40000) {
            System.out.println("Average Salary: " + avg);
            System.out.println("Salary Category: Low Salary");

        }

        else if (avg >= 40000 && avg <= 70000) {
            System.out.println("Average Salary: " + avg);
            System.out.println("Salary Category: Medium Salary");
        }

        else {
            System.out.println("the average salary: " + avg);
            System.out.println("salary category: High Salary");
        }

    }}