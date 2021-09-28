package Switch;

import java.util.Scanner;

public class SwitchTask1 {
    public static void main(String[] args) {
        /*
         ask user to provide by using switch

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number between 1 to 7");
        int number = scanner.nextInt();


        switch(number){

            default:
                System.out.println("This not matching day for entry");
                break;// we need put here break bc we have case in the line.
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            //default:
                //System.out.println("This not matching day for entry");
                //break;// we can't put here break bc we are haven't case in the next line.

        }
    }
}
