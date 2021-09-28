package Array;

import java.util.Arrays;

public class MultidimentalArray {
    public static void main(String[] args) {


        int[][] numbers = new int[3][4];
        numbers[0][0] = 11;
        numbers[0][1] = 22;
        numbers[0][2] = 33;
        numbers[0][3] = 33;
        numbers[0][3] = 44;
        numbers[2][3] = 99;


        System.out.println(numbers[0][0]); // it will
        System.out.println(numbers);// it will show Ashkicode
        System.out.println(numbers[0][3]);

        System.out.println(Arrays.toString(numbers));// toString ()  methods will print out hash code for multi dimentinal array
        System.out.println(Arrays.deepToString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {


            }
            //System.out.println(numbers[j]);

        }
        for (int[] array : numbers) {
            //for (int[] number : array) {

                System.out.println("*" + numbers);
            }
        }
    }
