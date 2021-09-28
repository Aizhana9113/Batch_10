package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask2 {
    public static void main(String[] args) {

        // create an array to store these numbers
        // using loop print out only number they are greder than 10


        int number[] = {45, 5, 6, 47,57, 8, 12, 0, 30};
        int smallNumber[] = new int[number.length];
        for (int index = 0; index < number.length; index++) {

            if (number[index] > 10) {
                System.out.println(number[index]);

            } else {
                smallNumber[index] = number[index];
            }

        }
        System.out.println(Arrays.toString(smallNumber));
    }
}