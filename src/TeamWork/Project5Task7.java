package TeamWork;

import java.util.Scanner;

public class Project5Task7 {
    public static void main(String[] args) {
        /*
        Using a scanner enter a sentence that is not separated by space and each word
starts with upper case. Print given String as separated words with spaces.
Example:
Given Value: "IWantToLearnJava"
Output: I Want To Learn Java
Example-2:
Given Value: "ItIsSunnyOutside"
Output: It Is Sunny Outside
         */



        Scanner scan = new Scanner(System.in);
       System.out.println(" Enter a String no space with each word stars with uppercase");
       String word = scan.nextLine();
       String firstLetter= " ";
        System.out.println(firstLetter);

       for (int i = 1; i < word.length(); i++) {

               if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                   i++;
                   System.out.print(" " +word.charAt(i));
               }else{
                   System.out.print(word.charAt(i));
               }

           }
       }

       }
