package HomeWork9;

import java.util.Arrays;

public class HW9Task4 {
    public static void main(String[] args) {
        /*

Write the application to find the second largest value from given
array.
Example:
Given array value: 3,2,8,9,1,5,4,3,7,8,5,9,9
Output: 8

         */


        int numbers[] = {3, 2, 8, 9, 1, 5, 4, 3, 7, 8, 5, 9, 9};

        int n = numbers.length;
        int higestNumber = Integer.MIN_VALUE;
        int secondHigest = Integer.MIN_VALUE;
        for (int i = 0; i< numbers.length; i++) {
            if (numbers[i] > higestNumber) {
                secondHigest = higestNumber;
                higestNumber = numbers[i];

            }
            if (numbers[i] < higestNumber && numbers[i] > secondHigest){
                secondHigest = numbers[i];
            }

        }
        System.out.println(" Second higest number" + secondHigest);
    }
}