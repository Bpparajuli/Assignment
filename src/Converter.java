/*Write a program that reads a Fahrenheit degree in double then converts it to Celsius
and displays the result on the console.
The formula for the conversion is as follows:
( celsius = Fahrenheit – 32 * 5 / 9 )
*/

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.println("*********************************");
        System.out.println("Welcome to Temperature converter");
        System.out.println("*********************************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit:");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius");

    }
}

//Assignment 1 Fahrenheit to Celsius Converter
