package HomeWork8;

import java.util.Scanner;

public class HW8Task1nTerm {
    public static void main(String[] args) {
        /*
        Write a program in Java to find the sum of the series 1 +11 + 111 +
1111 + .. n terms.
Test Data :
Input the number of terms : 5
Expected Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345
         */
        int firstNumberInSeries = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number ");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i == number) {
                System.out.println(firstNumberInSeries);
            } else {
                System.out.print(firstNumberInSeries + "+");

            }
            firstNumberInSeries = firstNumberInSeries * 10 + 1;


        }

        System.out.println("++++++++++++++++++++++");

        int result = 0;
        int sum = 0;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("please enter your digit");
        int digit = scan1.nextInt();
        for (int i = 0; i < digit; i++) {

            result = result * 10 + 1;
            sum += result;


            System.out.print(result + "+");

        }
        System.out.println("\n Sum is "+sum);// \n it meaning is next line



            //if (i == digit) {

                //System.out.println(result);

            //} else {
                //System.out.print(result + "+");







        }

    }
