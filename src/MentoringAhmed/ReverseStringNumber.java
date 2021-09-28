package MentoringAhmed;

import java.util.Scanner;

public class ReverseStringNumber {
    public static void main(String[] args) {

        // ask user to input some words and sout the reverse  of the word
        //String word = Hello my name is ahmed.

        // step1; read the question carefulli and understand what is ask for
        // step2 ; Start making logic
        //step3; i need to ask user to input some word
        //step4; I need to reach out every single letter how
        //step5; i need to start from last not beginning how?
        // step 6; I need to show them on console I think I know that?


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the word");
        String word = scan.nextLine();



        String reverse="";
        for(int i= word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse);




    }
}
