package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

       System.out.println("How many hours do you spending doing homework a day (on average)?");
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();

        if (hours > 5) {
            System.out.println("Wow! Keep up the good work!");
        }
        else if (hours < 1) {
            System.out.println("You are probably failing which is not something to brag about. Get to studying!");
        }
        else {
            System.out.println("Eh not bad");
        }
        }
    }

