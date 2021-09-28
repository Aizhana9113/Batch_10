package HomeWork6;

import java.util.Scanner;

public class HomeWork6Task5 {
    public static void main(String[] args) {
       /*
       Write a Java program that takes a year from user and print
whether that year is a leap year or not.
Input the year: 2016
Output :2016 is a leap year
        */

            int number = 2016;
            int number1 = number%10;
            number= number/10;
            int number2 = number%10;
            number= number/10;
            int number3 = number%10;
            number= number/10;
            int number4 = number%10;


            System.out.println("" + " " +number4+ " "+number3+"  "+number2+ " " +number1);
        }
    }

