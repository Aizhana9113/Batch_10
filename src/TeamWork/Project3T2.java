package TeamWork;

import java.util.Scanner;

public class Project3T2 {
    public static void main(String[] args) {


    /*
    Write the program to get the string value from the specified position.
    First, ask the user to enter one String value.
    Then ask the user to the enter starting number and ending number.
    After that, print the value between the given starting and ending numbers.
    (Note: since the user does not know the java, the user starts counting from 1,
    and theending number will be included)
    Example:Please enter the String value:
    Definition of Science Please enter the starting number:
    2 Please enter the ending number 5
    The output is
     */

       Scanner scan = new Scanner(System.in);
        System.out.println("Please enter one String value");
        String value = scan.nextLine();
        System.out.println("Please enter the first value:");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter the second value:");
        int secondNumber = scan.nextInt();
        String newString= value.substring(firstNumber-1,secondNumber-1);
        System.out.println(newString);

    }
}