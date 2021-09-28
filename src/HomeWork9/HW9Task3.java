package HomeWork9;

import java.util.Arrays;
import java.util.Scanner;

public class HW9Task3 {
    public static void main(String[] args) {
        /*
  Create one int array with size of 10 without any value. Using scanner ask
user to provide the int value until you filled out the array with given numbers.
Then print the array with all numbers.
Int [] numbers=new int[10];
Example:
Please enter the int number. You have 10 space in array:
11
Please enter the int number. You have 9 space in array:
43
Please enter the int number. You have 8 space in array:
77
.. keep continue to ask user until you don't have any space in the array.


         */

        int [] number1= new int [10];
        System.out.println(Arrays.toString(number1));

        Scanner scan = new Scanner(System.in);
        System.out.println("Please give your size");
        int number = scan.nextInt();

        int [] array = new int[number];
        for (int i=0; i<number; i++){
            System.out.println("Please the element ");
            array[i]=scan.nextInt();

            }
        scan.close();
        System.out.println("Our elements ");
        for (int i=0; i< array.length;i++){
            System.out.println(Arrays.toString(array));
        }

    }
}
