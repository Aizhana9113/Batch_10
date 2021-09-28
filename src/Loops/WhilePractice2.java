package Loops;

import java.util.Scanner;

public class WhilePractice2 {
    public static void main(String[] args) {
        /*
        print out "I am here today"
        for the age from  23 to 26

         */

        //int age =23;
        //if (age>=23 && age<=26){
            //System.out.println("I am here");
            //age ++;

           int age =  23;
        System.out.println("I am not here");

        while(age <=26){

            System.out.println("Ia am here ");
            age++;

        }
        System.out.println("I am not here");



        // print out number between 10 20 inclusive


        //int number =10;
        //while(number<=20){ // here = will show included 20 if we are haven't = this time will not show number 20
            //number++; // if we are put ++ after number it will show one more example 21 // 11
            //System.out.println("It number is "+ number);
            //number++;

            /*
            ask user to enter a integer number
            find and print the numbers which can divide that given number
            input == 10 >>>>> 1,2,5,10
            input == 15 >>>>>> 1,3,5,15
             */
            Scanner input = new Scanner(System.in);
            System.out.println(" Please enter the integer value ");
            int number = input.nextInt();

            int divider =1;

            System.out.println(divider);

            while(divider<=number){

            if(number % divider ==0){
                System.out.println(divider);
            } divider++;




            }



        }

    }
