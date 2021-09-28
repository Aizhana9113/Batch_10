package HomeWork9;

import java.util.Arrays;
import java.util.Scanner;

public class HW9Task2 {
    public static void main(String[] args) {
/*
Using Scanner ask user to provide any string value and index number
from  the array.
Using for loop update value from array.
Example:
[ Liam, Emma, Noah, Olivia, William ]
Please enter String:
Lucas
Please enter index number:
3
Output:
[ Liam, Emma, Noah, Lucas, William]
 */
        String[] names = {"Liam", "Emma", "Noah", "Olivia", "William"};
        System.out.println(Arrays.toString( names));


        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose your String ");
        String word = scan.nextLine();
        System.out.println("Please choose your index ");
        int index = scan.nextInt();

        for (int i = 0; i < names.length; i++) {
            if ( index==i) {
                names[i] = word;// if we are will = other name it will resing
            }

        }
        System.out.println(Arrays.toString(names));


    }
}