package TeamWork;

import java.util.Scanner;

public class Project5Task2 {
    public static void main(String[] args) {
        /*
        Using the scanner asks the user to input the min and max

        number. Write a java code that will calculate the sum of
        numbers between the range of min and max and those that
        can only be divided by 2 and 7.
        (min and max numbers are included)
        Example:
        0, 50 -> 14 + 28 + 42 = 84

         */
//
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a min number");
        int minNumber = scan.nextInt();
        System.out.println("Enter your max number");
        int maxNumber = scan.nextInt();
        int sum = 0;
        String sumTheNumber="";
        //if the can be divded by 2 and 7 we should add the
        //number in the string
        // that is divided by 2 and 7
        //0-50
        //0 7,14,28,42
        //if you add 14 the number
        for (; minNumber <= maxNumber; minNumber++) {
            if (minNumber % 2 == 0 && minNumber % 7 == 0) {
                sum += minNumber;
                //System.out.println(sum);
                if (minNumber+14>=maxNumber);
                sumTheNumber+=minNumber+"=";

            }else{
                sumTheNumber+=minNumber+"+";}
                sum+=minNumber;
        }
        System.out.println(sum);
    }
}