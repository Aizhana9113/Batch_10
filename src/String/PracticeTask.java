package String;

import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args){

        /*

        ask user to provide there height and weight
        and calculate there BNI
         Formula ----> BMI = weight / height*height
         */

          Scanner input = new Scanner(System.in);

        System.out.println( " What is your weight ?" );
        Double weight = input.nextDouble();

        System.out.println("What is your height in meter? ");

        Double height = input.nextDouble();

        double BMI = weight / (height*height);

        System.out.println("Your BMI is "+BMI);




    }
}
