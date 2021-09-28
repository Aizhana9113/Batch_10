package HomeWork7;

import java.util.Scanner;

public class HomeWork7Task2 {
    public static void main(String[] args) {
        /*
        Using a scanner ask the user to provide starting and ending numbers.
         Print the numbers divisible by 3 and 5 between given number AND print count of those numbers
        which is divisible by 3 and 5.
        EXAMPLE:First number:5
        Second number: 65
        Output:15
               30
               45
               60
        Total number that divisible by 3 and 5 is 4.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Print the  first number divisible by 3 and 5");
        //int firstNumber = 3;
        //int lastNumber = 5;
        //int number=scan.nextInt();
        int firstNumber = scan.nextInt();
        System.out.println("Please enter the last number ");
        int lastNumber = scan.nextInt();


            while (firstNumber <= lastNumber) {

                if (firstNumber%3==0 && firstNumber%5==0) {

                    //firstNumber = firstNumber / divider1;
                    System.out.println(firstNumber);


                }firstNumber++;



            }

        }
    }








