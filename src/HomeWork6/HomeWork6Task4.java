package HomeWork6;

import java.util.Scanner;

public class HomeWork6Task4 {
    public static void main(String[] args) {
/*
        Given a string, if a length 2 substring appears at both its
        beginning and end, print a string without the substring at the
        beginning, so "HelloHe" yields "lloHe". The substring may overlap
        with itself, so "Hi" yields "". Otherwise, print the original string
        unchanged.
                Example:
        "TestTe" --> print stTe
        "TestTi" --> pri

 */
  Scanner scan = new Scanner(System.in);
        System.out.println("Please enter yor word");
            String word = scan.nextLine();
            String xLetters = word.substring(0,2);
            if (word.length() == 2){
                System.out.println("your output is empty");
            }
            if (word.endsWith(xLetters)){
                System.out.println(word.substring(2));
            }
            else{
                System.out.println(word);
            }



    }
}
