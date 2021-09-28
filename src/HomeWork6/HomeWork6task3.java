package HomeWork6;

import java.util.Scanner;

public class HomeWork6task3 {
    public static void main(String[] args) {
        /*
        Given a string, if one or both of the first 2 chars is 'x', print the
string without those 'x' chars, and otherwise print the string
unchanged.
"xHi" → "Hi"
"Hxi" → "Hi"
"Tesxt" → "Testxt"
         */

            Scanner scr = new Scanner(System.in);
            System.out.println("Please enter a string");
            String word = scr.nextLine();
            String first2Letters = word.substring(0, 2);

            if (("" + word.charAt(0)).equalsIgnoreCase("x") && ("" + word.charAt(1)).equalsIgnoreCase("x")) {
                System.out.println(word.substring(2));
            } else if (("" + word.charAt(0)).equalsIgnoreCase("x")) {
                System.out.println(word.substring(1));
            } else if (("" + word.charAt(1)).equalsIgnoreCase("x")) {
                System.out.println(word.charAt(0) + word.substring(2));
            } else{
                System.out.println(word);
            }
        }
    }


