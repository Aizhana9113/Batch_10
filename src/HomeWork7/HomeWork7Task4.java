package HomeWork7;

import java.util.Scanner;

public class HomeWork7Task4 {
    public static void main(String[] args) {
  /*  TASK4
  Using the scanner ask the user to provide String value. Then replace all the
char of the String with 'a' using loop and print in every step.
            For example:
Input: Success
Output:
"auccess"
"aaccess"
“aaacess”
            ...
            “aaaaaaa”
   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter string value");
        String word = scan.nextLine();

        for (int index =0;index<=word.length()-1;index++){
            word=word.replace(word.charAt(index),'a');
            System.out.println(word);


            }


        }
    }



