package com.bridge.temprature;
import java.util.Scanner;

public class Temprature {
     public static void calculateTemprature() {
        float fahrenheit, celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter  Fahrenheit temperature");
                fahrenheit = sc.nextFloat();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Celsius temperature is = " + celsius);
                break;
            case 2:
                System.out.println("Enter  Celsius temperature");
                celsius = sc.nextFloat();
                fahrenheit = ((9 * celsius) / 5) + 32;
                System.out.println("Fahrenheit temperature is = " + fahrenheit);
                break;
            default:
                System.out.println("please choose valid choice");
        }
    }

    public static void main(String arg[]) {
        calculateTemprature();

    }
}