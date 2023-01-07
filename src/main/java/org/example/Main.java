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
                scan.nextLine();
                if (budget >= 40000) {
                    System.out.println("\nWe have a Lexus 450 with your name on it!!!" +
                            "\nDo you have any insurance? Please write 'yes' or 'no'");
                    String insure = scan.nextLine();
                    System.out.println("\nDo you have a license? Please write 'yes' or 'no'");
                    String license = scan.nextLine();
                    System.out.println("What is your credit score?");
                    int creditLine = scan.nextInt();
                    scan.nextLine();
                    if(insure.equals("yes") && license.equals("yes") && creditLine >= 620){

                    }

                } else if (budget >= 10000) {
                    System.out.println("\nGreat! A Nissan Altima is available." +
                            "\nDo you have any insurance? Please write 'yes' or 'no'");
                    String insure = scan.nextLine();
                    System.out.println("\nDo you have a license? Please write 'yes' or 'no'");
                    String license = scan.nextLine();
                    System.out.println("What is your credit score?");
                    int creditLine = scan.nextInt();
                    scan.nextLine();


                }else {
                    System.out.println("\nWe don't sell cars under $10,000. Apologies!");
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