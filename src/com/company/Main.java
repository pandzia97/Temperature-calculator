package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter degrees in Celsjusz : ");
        double degrees = scanner.nextDouble();

        double Fahrenheit = (degrees * 1.8) + 32;
        double Kelvin = degrees + 273.15;
        double Rankine = (degrees + 273.15) * 1.8;
        double Réaumur = (degrees * 4) / 5;
        double Rømer = degrees * 21 / 40 + 7.5;
        double Delisle = ((100) - (degrees)) * 3 / 2;
        double Newton = degrees * 33 / 100;

        System.out.println("Fahrenheit " + Fahrenheit);
        System.out.println("Kelvin " + Kelvin);
        System.out.println("Rankine " + Rankine);
        System.out.println("Réaumur " + Réaumur);
        System.out.println("Rømer " + Rømer);
        System.out.println("Delisle " + Delisle);
        System.out.println("Newton " + Newton);
    }
}
