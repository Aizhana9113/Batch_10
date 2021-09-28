package Loops;

import java.util.Random;
import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
        // get the integer from user witch less than 10
        // print out the numbers starting from that given number to 10 is included

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the positive number  less than 10 ");

        int number = scanner.nextInt();
        for(;number<=10;){// here =
            number++;// it will icreased twice.// if we give ++ inside it will just break
            System.out.println("user number is "+number);

        }
    }
}
