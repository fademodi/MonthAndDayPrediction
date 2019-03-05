package com.LckingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number;

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.print("ask a yes or no question");
        keyboard.nextLine();

        System.out.print("choose number 1 through 100");
        number = keyboard.nextInt();

        if((number >= 0) && (number <= 10)) {
            System.out.println("yes");
        }
        else if((number >= 11) && (number <= 20)) {
            System.out.println("absolutely");
        }
        else if((number >= 21) && (number <= 30)) {
            System.out.println("positive");
        }
        else if((number >= 31) && (number <= 40)) {
            System.out.println("agree");
        }
        else if((number >= 41) && (number <= 50)) {
            System.out.println("indeed");
        }
        else if((number >= 51) && (number <= 60)) {
            System.out.println("no");
        }
        else if((number >= 61) && (number <= 70)) {
            System.out.println("negatively");
        }
        else if((number >= 81) && (number <= 90)) {
            System.out.println("never");
        }
        else if((number >= 91) && (number <= 100)) {
            System.out.println("nah");
        }








    }
}
