package IfStatement;

import java.util.Scanner;

public class NestedIfPractice {
    public static void main(String[] args) {
        /*
        ask user for his/ her city name
        if city name is Chicago
        Ask user "What is the school name
        if the school name is "Techtorial '
        print ---> you  are luck to be in the B10
        if the school name is not "Techtorial"
        print ---> please come and visit us

         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your city name?");
        String cityName = scanner.nextLine();
        if (cityName.equalsIgnoreCase("Chicago")) {

        System.out.println("What is your school name?");
        String schoolName = scanner.nextLine();
        if (schoolName.equalsIgnoreCase("Techtorial")) {
            System.out.println("You  are luck to be in the B10");

        }else {

            System.out.println("Please choose the Techtorial");
        }
        }else{
            System.out.println("Please come to Chicago ");

        }
    }
}


