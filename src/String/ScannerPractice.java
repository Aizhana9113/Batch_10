package String;

import java.util.Date;
import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in); // this is scanner object
        String firstName = "Fluffy";
        String lastName = "Brown";
        System.out.println(lastName);
        System.out.println("Please enter some string");
        String random = input.nextLine();
        System.out.println(random);
        String middleName;
        System.out.println("Please enter your middle name");
        middleName = input.nextLine();
        System.out.println(firstName + middleName + lastName);

         */

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++


        Scanner Dave = new Scanner(System.in);
        System.out.println("What is your first name?");
        Dave.nextLine();
        System.out.println("How old are you?");
        int age = Dave.nextInt();
        System.out.println(" how are you? ");
        Dave.nextLine();

        System.out.println("What is your last name? ");

        int ageInyears = age+2;
        System.out.println(ageInyears);


    }
}
