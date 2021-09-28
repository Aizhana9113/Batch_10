package Array;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        // creat an array to store these number: 45,6,
        // find the biggest number this array


        int numbers[] = {45, 5, 6, 47,57, 8, 12, 30};
        int biggest = numbers [0];
        for (int index =1; index < numbers.length;index++ ){


        if (numbers[index]>biggest) {
            biggest = numbers[index];


        }
            System.out.println(biggest); // it will show

        }
        System.out.println("-----------------------");
        System.out.println(biggest);

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // print last element from these array
        System.out.println(numbers[numbers.length-1]);//it will count start last number
        // print out smallest number
        System.out.println(numbers[0]);// it will show smallest number bc zero is smallest index


 // write a code to find smallest number with out sort method






        int numbers1[] = {45, 5, 6, 47,57, 8, 12, 30};

        int smallestNumber = numbers1[0];

        for (int index = 1; index < numbers1.length; index++){// we need start index from 1 (one) bc we need compare with index (0)zero

            if (numbers1[0] < smallestNumber) {// here  will compare ech the numbers witch i have
                smallestNumber=numbers1[index];// it is resinning for smallest number


                //System.out.println(smallestNumber[index]); we cant give sout inside for bc it is compare

            }

        }
        System.out.println(smallestNumber);
        System.out.println(Arrays.toString(numbers));
    }
    }

