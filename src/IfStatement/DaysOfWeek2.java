package IfStatement;

import java.util.Scanner;

public class DaysOfWeek2 {
    public static void main(String[] args) {
        /*

        ask user to enter first letter of day

        M----> Monday
        T -----> Tuesday or Thursday
        W -----> Wendsday
        F -----> Friday
        S ----> Saturday or Sunday

         */

        Scanner object = new Scanner(System.in);
        System.out.println("Enter first letter of day");

        String letter = object.nextLine();
        if(letter.equalsIgnoreCase("M")){

            System.out.println("It is Monday");

        }
        if(letter.equalsIgnoreCase("T")){
            System.out.println("It is Tuesday or Thursday");

        }

        if(letter.equalsIgnoreCase("F")){
            System.out.println("It is Friday");


        }

        if(letter.equalsIgnoreCase("S")){
            System.out.println("It is Saturday or Sunday");

        }

        else{

            System.out.println("your entry is not valid, there is no day starting with this char");

        }


    }
}
