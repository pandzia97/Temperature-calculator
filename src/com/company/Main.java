package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select name degrees");
        System.out.println("1. Celsjusz ");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("4. Rankine");
        System.out.println("5. Réaumur");
        System.out.println("6. Rømer");
        System.out.println("7. Delisle");
        System.out.println("8. Newton");
        System.out.println("0. Exit");
        int choice = scanner.nextInt();
        System.out.println("Enter degrees: ");
        double degrees = scanner.nextDouble();

        switch (choice) {
            case 1:
                double CelsjuszToFahrenheit = (degrees * 1.8) + 32;
                double CelsjuszToKelvin = degrees + 273.15;
                double CelsjuszToRankine = (degrees + 273.15) * 1.8;
                double CelsjuszToRéaumur = (degrees * 4) / 5;
                double CelsjuszToRømer = degrees * 21 / 40 + 7.5;
                double CelsjuszToDelisle = ((100) - (degrees)) * 3 / 2;
                double CelsjuszToNewton = degrees * 33 / 100;

                System.out.println("Fahrenheit " + CelsjuszToFahrenheit);
                System.out.println("Kelvin " + CelsjuszToKelvin);
                System.out.println("Rankine " + CelsjuszToRankine);
                System.out.println("Réaumur " + CelsjuszToRéaumur);
                System.out.println("Rømer " + CelsjuszToRømer);
                System.out.println("Delisle " + CelsjuszToDelisle);
                System.out.println("Newton " + CelsjuszToNewton);
                break;
            case 2:
                double FahrenheitToCelsjusz = (degrees - 32) / 1.8;
                double FahrenheitToKelvin = (degrees + 459.67) * 5 / 9;
                double FahrenheitToRankine = degrees * 459.67;
                double FahrenheitToRéaumur = (degrees - 32) * 4 / 9;
                double FahrenheitToRømer = (degrees - 32) * 7 / 24 + 7.5;
                double FahrenheitToDelisle = (212 - (degrees)) * 5 / 6;
                double FahrenheitToNewton = (degrees - 32) * 11 / 60;

                System.out.println("Celsjusz " + FahrenheitToCelsjusz);
                System.out.println("Kelvin " + FahrenheitToKelvin);
                System.out.println("Rankine " + FahrenheitToRankine);
                System.out.println("Réaumur " + FahrenheitToRéaumur);
                System.out.println("Rømer " + FahrenheitToRømer);
                System.out.println("Delisle " + FahrenheitToDelisle);
                System.out.println("Newton " + FahrenheitToNewton);
                break;
            case 3:
                double KelvinToCelsjusz = degrees - 273.15;
                double KelvinToFahrenheit = (degrees * 1.8) - 459.67;
                double KelvinToRankine = (degrees - 273.15) * 1.8 + 491.67;
                double KelvinToRéaumur = (degrees - 273.15) * 4 / 5;
                double KelvinToRømer = (degrees - 273.15) * 21 / 40 + 7.5;
                double KelvinToDelisle = (373.15 - (degrees)) * 3 / 2;
                double KelvinToNewton = (degrees - 273.15) * 33 / 100;

                System.out.println("Celsjusz " + KelvinToCelsjusz);
                System.out.println("Fahrenheit " + KelvinToFahrenheit);
                System.out.println("Rankine " + KelvinToRankine);
                System.out.println("Réaumur " + KelvinToRéaumur);
                System.out.println("Rømer " + KelvinToRømer);
                System.out.println("Delisle " + KelvinToDelisle);
                System.out.println("Newton " + KelvinToNewton);

            default:
                break;
        }
    }
}
