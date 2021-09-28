package HomeWork9;

import java.util.Arrays;
import java.util.Scanner;

public class HW9Task1 {
    public static void main(String[] args) {


//    Description
//    Create the int array with given numbers
//10,4,3,55,32,145,443,234,98,32
//    Using scanner user to provide any number from given array, then
//    remove the value from array and put 0 instead of that.
//            Example:
//    Given Number:
//            234
//    Output:
//            10, 4, 3, 55, 32, 145, 443, 0, 98, 32
//
//
//
         int numbers [] = { 10, 4, 3, 55, 32, 145, 443, 234, 98, 32 };
        System.out.println(Arrays.toString(numbers));

        System.out.println("chose a number to replace with 0 ");
        Scanner scan = new Scanner(System.in);
        int usersChoice = scan.nextInt();

        boolean numberExists = false;

        for(int i = 0; i<numbers.length; i++){
            if(usersChoice==numbers[i]){
                numberExists = true;
                break;
            }
        }

        if (numberExists){
            for(int i = 0; i<numbers.length; i++){
                if(usersChoice==numbers[i]){
                    numbers[i] = 0;
                    System.out.println(Arrays.toString(numbers));
                    break;
                }
            }
        }else {
            System.out.println("invalid input, number doesn't exist in the array");
        }





//        numbers[7] = 0;
//        System.out.println("after update "+ numbers[7]);









//        int[] numbers = {10, 4, 3, 55, 32, 145, 443, 234, 98, 32};
//        int index = 7;
//        int[] newElement = new int[numbers.length - 1];
//
//
//        for (int i = 0, k = 0; i < numbers.length; i++) {
//            if (i == index) {
//                continue;
//            }
//             //System.out.println(Array);
//            newElement[k++] = numbers[i];
//        }
//
//        System.out.println("New element is " + Arrays.toString(newElement));

    }
    }