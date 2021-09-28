package HomeWork6;

import java.util.Scanner;

public class HomeWork6Task1 {
    public static void main(String[] args) {
        /*
        Using scanner ask user to enter to String value and concatenate them
together then print the result. If both String length is not same then omit
chars from the longer string so it is the same length as the shorter string.
After making both string same length then concatenate it.
EXAMPLE-1:
String 1: "Cell"
String 2: "Phone"
Output: "CellPhone"
EXAMPLE-2:
String 1: "Cable"
String 2: "Mich"
Output: "CabMic
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you first word");
        String word1 = scan.nextLine();
        System.out.println("Please enter your second word");
        String word2 = scan.nextLine();
        String result = word1.length() <= word2.length() ? word1 : word2;
        if ( result.equalsIgnoreCase(word1)){
            int unswer = word1.length();

            String minus=word2.substring(0,unswer);

            System.out.println(result.concat(minus));



        }else {
            int lengthSecond = word2.length();
            String minus = word1.substring(0, lengthSecond);
            System.out.println(minus.concat(word2));


        }


    }

}
