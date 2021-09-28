package Primitives;

public class ReminderPractice2 {
    public static void main(String[] args){

         //find the product of digit form a four digit given number (1234)
        //print the result
        //" The product is "

        //int a = 1,b = 2, c = 3, d = 4;

        //System.out.println();





        int number = 1234;

         int fourDigit = number%10;

        System.out.println("The product is ---> "+fourDigit);

         int number1 = 222;

         int d1 = number1 %10;// this is first digit  ---> 2

        number = number1 /10; // this is my new number --> 143

        int d2 = number1 %10; // this is second digit  --> 3

        number = number1 /10; // this is my new number ---> 14

        int d3 = number1 %10; // this is my third number ---> 4


        number = number1 /10; // this is my new number ------> 1

        int d4 = number1 %10;

         int product = d1*d2*d3;

        System.out.println("This is product is --->" + product);




    }
}
