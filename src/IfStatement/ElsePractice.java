package IfStatement;

import java.util.Scanner;

public class ElsePractice {
    public static void main(String[] args) {
        /*
        ask user to an integer value
        chek and print if the "number is even"
        otherwise print "odd number"
         */
       Scanner input = new Scanner(System.in);
        System.out.println("Please enter integer value ");
        int a =input.nextInt();

        if (a%2==0) {
            System.out.println("number is even" + a);
        } //

       else {

            System.out.println("odd number" + a);
        }
    }
}
