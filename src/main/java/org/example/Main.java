package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the java dealership!");

        System.out.println(".select option 'a' to buy a car");
        System.out.println(".select option 'b' to sell a car");

        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("What is your budget?");
                int budget =scan.nextInt();
                if (budget >= 40000) {
                    System.out.println("We have a Lexus 450 with your name on it!!!");
                } else if (budget >= 10000) {
                    System.out.println("Great! A Nissan Altima is available.");
                }else {
                    System.out.println("We don't sell cars under $10,000. Apologies!");
                }
                break;

            case "b":
                System.out.println("You're Ready to sell! you picked ");
                break;

            default:  System.out.println("invalid option!");
        }

        scan.close();
    }
}