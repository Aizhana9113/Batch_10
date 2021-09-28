package HomeWork8;

import java.util.Scanner;

public class HW8Task3ArmStrongNumber {
    public static void main(String[] args) {
        //    Write a Java program to check whether a given number is an armstrong number or not.
        //    Test Data :Input a number: 153
        //    Expected Output :153 is an Armstrong number.
        //    NOTE:
        //    An Armstrong number, also known as narcissistic number, is
        //    a number that is equal to the sum of the cubes of its own digits.
        //    For example, 370 is an Armstrong number since 370 = 3*3*3 + 7*7*7 + 0*0*0


        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your number");
        int userNumber = scan.nextInt();

        int remainder = 0;
        int sum = 0;
        int temp = userNumber;
        while (userNumber > 0) {
            remainder = userNumber % 10;
            sum = sum + (remainder * remainder * remainder);
            userNumber = userNumber % 10;
        }
            if (temp == sum) {
                System.out.println(sum+"it is armstrong number");

        }
            else {
                System.out.println("it is not armstron number");



        }
        }
    }