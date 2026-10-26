package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Please enter your name. ");

        System.out.println("First name: ");
        String firstName = myscanner.nextLine();

        System.out.println("Middle name");
        String middleName = myscanner.nextLine();

        System.out.println("Last name");
        String lastName = myscanner.nextLine();

        System.out.println("Suffix: ");
        String suffix = myscanner.nextLine();


        if (!middleName.isBlank()) {

        }
    }

}