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
                break;
            case 4:
                double RankineToCelsjusz = (degrees / 1.8) - 273.15;
                double RankineToFahrenheit = degrees - 489.67;
                double RankineToKelvin = degrees * 5 / 9;
                double RankineToRéaumur = (degrees - 491.67) * 0.44444;
                double RankineToRømer = (degrees - 491.67) * 0.29167 + 7.50;
                double RankineToDelisle = (degrees - 491.67) * 0.83333 - 100.00;
                double RankineToNewton = (degrees - 491.67) * 0.18333;

                System.out.println("Celsjusz " + RankineToCelsjusz);
                System.out.println("Fahrenheit " + RankineToFahrenheit);
                System.out.println("Kelvin " + RankineToKelvin);
                System.out.println("Réaumur " + RankineToRéaumur);
                System.out.println("Rømer " + RankineToRømer);
                System.out.println("Delisle " + RankineToDelisle);
                System.out.println("Newton " + RankineToNewton);
                break;
            case 5:
                double RéaumurToCelsjusz = 1.25 * degrees;
                double RéaumurToFahrenheit = (degrees * 2.25) + 32;
                double RéaumurToKelvin = (degrees - 273.15) * 0.80000;
                double RéaumurToRankine = (degrees - 491.67) * 0.44444;
                double RéaumurToRømer = (degrees - 7.5) * 1.5238;
                double RéaumurToDelisle = degrees * 1.8750 - 100.00;
                double RéaumurToNewton = degrees * 0.41250;

                System.out.println("Celsjusz " + RéaumurToCelsjusz);
                System.out.println("Fahrenheit " + RéaumurToFahrenheit);
                System.out.println("Kelvin " + RéaumurToKelvin);
                System.out.println("Rankine " + RéaumurToRankine);
                System.out.println("Rømer " + RéaumurToRømer);
                System.out.println("Delisle " + RéaumurToDelisle);
                System.out.println("Newton " + RéaumurToNewton);
                break;
            case 6:
                double RømerToCelsjusz = (degrees - 7.5) * 40 / 21;
                double RømerToFahrenheit = (degrees - 7.5) * 24 / 7 + 32;
                double RømerToKelvin = (degrees - 7.5) * 40 / 21 + 273.15;
                double RømerToRankine = (degrees - 7.5) * 3.4286 + 491.67;
                double RømerToRéaumur = (degrees - 7.5) * 1.5238;
                double RømerToDelisle = (degrees - 7.5) * 2.8571 - 100.00;
                double RømerToNewton = (degrees - 7.5) * 0.62857;

                System.out.println("Celsjusz " + RømerToCelsjusz);
                System.out.println("Fahrenheit " + RømerToFahrenheit);
                System.out.println("Kelvin " + RømerToKelvin);
                System.out.println("Rankine " + RømerToRankine);
                System.out.println("Réaumur " + RømerToRéaumur);
                System.out.println("Delisle " + RømerToDelisle);
                System.out.println("Newton " + RømerToNewton);
                break;
            case 7:
                double DelisleToCelsjusz = 100 - degrees * 2 / 3;
                double DelisleToFahrenheit = (212 - (degrees)) * 6 / 5;
                double DelisleToKelvin = (degrees + 100) / 1.5 + 273.15;
                double DelisleToRankine = (degrees + 100) * 1.2000 + 491.67;
                double DelisleToRéaumur = (degrees + 100) * 0.53333;
                double DelisleToRømer = (degrees + 100) * 0.35000 + 7.50;
                double DelisleToNewton = (degrees + 100) * 0.22000;

                System.out.println("Celsjusz " + DelisleToCelsjusz);
                System.out.println("Fahrenheit " + DelisleToFahrenheit);
                System.out.println("Kelvin " + DelisleToKelvin);
                System.out.println("Rankine " + DelisleToRankine);
                System.out.println("Réaumur " + DelisleToRéaumur);
                System.out.println("Rømer " + DelisleToRømer);
                System.out.println("Newton " + DelisleToNewton);
                break;
            case 8:
                double NewtonToCelsjusz = degrees * 100 / 33;
                double NewtonToFahrenheit = degrees * 60 / 11 + 32;
                double NewtonToKelvin = degrees / 0.33000 + 275.15;
                double NewtonToRankine = degrees * 5.4545 + 491.67;
                double NewtonToRéaumur = degrees * 2.4242;
                double NewtonToRømer = degrees * 1.5909 + 7.50;
                double NewtonToDelisle = degrees * 4.5455 - 100.00;

                System.out.println("Celsjusz " + NewtonToCelsjusz);
                System.out.println("Fahrenheit " + NewtonToFahrenheit);
                System.out.println("Kelvin " + NewtonToKelvin);
                System.out.println("Rankine " + NewtonToRankine);
                System.out.println("Réaumur " + NewtonToRéaumur);
                System.out.println("Rømer " + NewtonToRømer);
                System.out.println("Delisle " + NewtonToDelisle);
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
