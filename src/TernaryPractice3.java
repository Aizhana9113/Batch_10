import java.util.Locale;
import java.util.Scanner;

public class TernaryPractice3 {


    public static void main(String[] args) {

        /*
        Ask user for their last name
        if the last name starts with 'A' to 'K'
            concat the last name with "most popular last name"
           otherwise;
           concat the last name with : "well known last name"
           --print out the result
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your last name?");
        String lastName = input.nextLine().toUpperCase();
        //lastName.startsWith("A")
        String print=lastName.charAt(0)>='A' && lastName.charAt(0)<='K'? lastName +" most popular last name":lastName + " well know last name";

        System.out.println(print);

        //char print1 = lastName.charAt(0) it will be show



    }
}
