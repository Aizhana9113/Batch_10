package TeamWork;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){


        //1. Write a program that will accept only 6 digit
        //numbers like 578432 and find multiplication
        //(5*7*8*4*3*2) of all digits and sum
        //(5+7+8+4+3+2)of all digits.
        //Example 1:
        //578432
        //Multiplication of all digits is 6720
        //The Sum of all digits is 29
        //Description
        //Scanner digit
        

        int number = 327695;

        int number1 = number%10;
        number= number/10;
        int number2 = number%10;
        number= number/10;
        int number3 = number%10;
        number= number/10;
        int number4 = number%10;
        number= number/10;
        int number5 = number%10;
        number= number/10;
        int number6 = number%10;

        int digitSum = (number1+number2+number3+number4+number5+number6);
        int multiplSum = (number1*number2*number3*number4*number5*number6);

        System.out.println(digitSum);
        System.out.println(multiplSum);


 // ++++++++++++++++++++++++++++++++++++++++++++++++++++++


        //Example1:327695;
        //Multiplicationofalldigitsis1134
        // Sumofalldigitsis 32





    }
}
