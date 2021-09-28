package MentoringAhmed;

import java.util.Scanner;

public class PlayingWithLetter {
    public static void main(String[] args) {


        /*Scanner scan = new Scanner(System.in);
        System.out.println("please enter your word");
        String word = scan.nextLine();
        String firstLetter = " ";
        String lastLetters =" ";
        firstLetter += word.charAt(0);

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                firstLetter += word.charAt(i + 1);
                lastLetters+=word.charAt(i-1);
                System.out.println("first letter is ---> "+firstLetter);
            }
        }
        lastLetters+=word.charAt(word.length()-1);
        System.out.println("last letter is -->"+lastLetters);
*/


        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your word");
        String word = scan.nextLine();
        String firstLetter = " ";
        String lastLetters =" ";
        firstLetter += word.charAt(0);

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(4) == ' ') {
                firstLetter += word.charAt(i + 4);
                lastLetters+=word.charAt(i-4);
                System.out.println("first letter is ---> "+firstLetter);
            }
        }
        lastLetters+=word.charAt(word.length()-4);
        System.out.println("last letter is -->"+lastLetters);






    }







    }

