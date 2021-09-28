package MentoringAhmed;

import java.util.Scanner;

public class GetTheDigitAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = scan.nextInt();
        int sumOfDigit = 0;
        int sumOfMultiplication = 1;

        while (number != 0) {
            int digit = number % 10;
            sumOfDigit += digit;
            sumOfMultiplication *= digit;
            number /= 10;

        }
        System.out.println(sumOfDigit);
        //System.out.println(sumOfMultiplication);
    }
}
