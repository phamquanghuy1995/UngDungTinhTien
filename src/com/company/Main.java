package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRante = 1.0;
        double totalInterest = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();

        System.out.println("Enter number of month: ");
        month = input.nextInt();

        System.out.println("Enter annual interst rate in percentage: ");
        interestRante = input.nextDouble();
        for (int i=0; i < month; i++){
            totalInterest+=money*(interestRante/100)/12*month;
        }
        System.out.println("Totl ò interest: "+ totalInterest);
    }
}
