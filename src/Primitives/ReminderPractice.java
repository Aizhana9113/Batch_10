package Primitives;

public class ReminderPractice {
    public static void main(String[] args){

        //123 find the sum of digits given number

        // 1+2+3 = 6 ---> print the ("The sum of digits = 6"

        int number = 123;

        int firstDigit = number % 10;// 123/ 10---> 12, reminder is 3


        int first$Digit = number % 10;
        int second$Digit = number % 10; //
        int third$Digit = number % 10;
        int originalNumber = first$Digit+second$Digit+third$Digit;

        System.out.println("Original number --->" + originalNumber);

        System.out.println(" First Digit or reminder ---> "+ firstDigit);


        /*
        int number2 = 443;

        int digit1 = number% 10;
        System.out.println(number2/10 + % digit1);

         */


          int number3 = 456;
          number3 = number3 % 10;
          int secondDigit = number % 10;
          int thirdDigit = number3 % 10;

          int total = number3+secondDigit+thirdDigit;


        System.out.println(" Total sum is " + total);




        System.out.println("Second Digit is " +secondDigit);
        System.out.println(" Third Digit is " + thirdDigit);

        number =number3/10;

          int number5 = number %10;
        System.out.println(number5);




    }
}
