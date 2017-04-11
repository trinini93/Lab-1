package com.company;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner (System.in); // scanner class to allow user input

        System.out.println("Welcome to Grand Circus' Room Detail Generator! "); // welcome screen

        System.out.println("Enter length: "); // prompting user to enter length
        double length = scnr.nextDouble(); //using double so we can enter double numbers for length i.e. 24.5

        System.out.println("Enter width: "); // prompting user to enter height
        double width = scnr.nextDouble(); //using double so we can enter double numbers for width

        double area = length * width; // formula for calculating area

        double perimeter = 2 * (length + width); // formula for calculating perimeter

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        System.out.println(); // garbage line

        System.out.println("Continue? (y/n): "); // asking user if they want to continue





    }
}
