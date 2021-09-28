package HomeWork8;

import java.util.Scanner;

public class HW8Task2PerfectNumber {
    public static void main(String[] args) {
        /*
        Write a Java program to find the perfect numbers within a given number of
range.
Test Data :
Input the starting range or number : 1
Input the ending range of number : 50
Expected Output :
The Perfect numbers within the given range : 6 28
NOTE: you need to use the
        */

                Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers " );
                int small = scanner.nextInt();
                int big = scanner.nextInt();
                OUTER:
                for (int i = small; i <= big; i++) {
                    // i is the current number we should check if it is prime
                    // All implementation is for to check if the is is prime
                    boolean isPrime=true;
                    INNER:
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            System.out.println(i+" is not a prime number");
                            isPrime=false;
                            break INNER;
                        }
                    }
                    if (!isPrime==true) {
                        System.out.println(i + " is the prime number.");
                    }

                }


        }
    }












