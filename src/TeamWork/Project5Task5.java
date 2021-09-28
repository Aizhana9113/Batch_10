package TeamWork;

import java.util.Scanner;

public class Project5Task5 {
    public static void main(String[] args) {
        /*
        Ask the user to enter one in number between 1 to 10 then, Write the
program to print the string in the following format:
Example:
Input: 6
Output:
666666
55555
4444
333
22
1
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  number between 1 to 10");
        int number = scan.nextInt();
        int index, j;
        for (index = number; index >= 1; index--) {//5
            for (j = 1; j <= index; j++) { // we are give this for increace like piramida
                System.out.print(index);
            }
            System.out.println(" "); // we use this sout for next line


        }

    }
}