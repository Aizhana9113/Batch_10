package TeamWork;

import java.util.Scanner;

public class Project5Task1 {
    public static void main(String[] args) {
        /*
        Reverse a given String and return it, if they have space in the
        beginning and at the end then remove it.
        Example:  " Job" -> "boJ"
                * " Happy " -> "yppaH"
                * "Sun " -> "nuS"
                * " Dream Job!" -> "!boJ maerD"

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your string");
        String str1 = scan.nextLine().trim();
        for (int i = str1.length(); i >= 0; i--) {
            System.out.print(str1.charAt(i));


        }
    }
}