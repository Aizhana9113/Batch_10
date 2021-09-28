package TeamWork;

import java.util.Scanner;

public class Project5Task4 {
    public static void main(String[] args) {
        /*
        Ask the user to enter one number between 1 to 10 then, Write the
program to print the string in the following format:
Example:
Input: 5
Output:
1
22
333
4444
55555
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  number betveen 1 to 10");
        int number = scan.nextInt();
        int index, j;
        for (index = 1; index <= number; index++) {//5
            for (j = 1; j <= index; j++) { // we are give this for increace like piramida
                System.out.print(index);
            }
            System.out.println(" "); // we use this sout for next line

        }
    }
}