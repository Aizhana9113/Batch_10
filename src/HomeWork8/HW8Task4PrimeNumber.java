package HomeWork8;

import java.util.Scanner;

public class HW8Task4PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int userNumber = scan.nextInt();
        boolean isPrime=false;
        for(int i =2; i<userNumber/2; i++){
            if (userNumber%i==0) {
                isPrime = true;
                System.out.println("It is  number is  NOT prime");

                break;
            }
            if (!isPrime){
                System.out.println("it is  prime numbers ");
            }























//        int small = scanner.nextInt();
//        int big = scanner.nextInt();
//        OUTER:
//        for (int i = small; i <= big; i++) {
//            // i is the current number we should check if it is prime
//            // All implementation is for to check if the is is prime
//            boolean isPrime=true;
//            INNER:
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    System.out.println(i+" is not a prime number");
//                    isPrime=false;
//                    break INNER;
//                }
//            }
//            if (isPrime==true) {
//                System.out.println(i + " is the prime number.");
//            }

        }
    }
}
