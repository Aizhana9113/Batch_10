package HomeWork8;

import java.util.Scanner;

public class HW8Task6Palindrome {
    public static void main(String[] args) {

//        Write a program in Java to check whether a String is a palindrome
//        or not.
//        Test Data :
//        Input a number: Civic
//        Expected Output :
//        Civic is palindrome
//        NOTE:
//        A string is said to be a palindrome if the string read from left to right
//        is equal to the string read from right to left. For example, ignoring
//        the difference between uppercase and lowercase letters,
//                the string "iTopiNonAvevanoNipoti" is a palindrome,


        Scanner scan = new Scanner(System.in);
        System.out.println("input your number");
        String name = scan.nextLine();
        String newString = "";

        for (int index= name.length()-1; index>=0;index--){

            newString= newString+name.charAt(index);
        }

        System.out.println(newString);

        if (name.equalsIgnoreCase(newString)){

            System.out.println("is palindrome");
        }else {
            System.out.println("is not palindrome ");
        }

    }


}


