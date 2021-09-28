package TeamWork;

import java.util.Scanner;

public class Project5Task3 {
    public static void main(String[] args) {
        /*
       Using a scanner ask a user to provide one int number. if the
number is a prime number then print "Prime Number"
otherwise print it is not a prime number.
NOTE:
A prime number is a whole number greater than 1 whose only
factors are 1 and itself. A factor is a whole number that can
be divided evenly into another number. The first few prime
numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scan.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < number; i++){


            if (number % i == 0 && number % number == 0) {
                System.out.println("It is not prime");
                isPrime= false;
                break;

            }

        }if(isPrime==true){
            System.out.println("it is prime number");
        }
    }
}