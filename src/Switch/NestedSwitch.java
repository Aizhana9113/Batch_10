package Switch;

import java.util.Locale;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        /*
        you are making calll to company

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter what do department you want to talk? 1- IT,2-HR, 3-REP");
        int departmentNumber= scanner.nextInt();
        switch(departmentNumber) {


            case 1:
                System.out.println("Who do you wnat to talk with? Raj,Alex, Jessi");
                String name = scanner.nextLine();
                name= scanner.nextLine();
                switch (name.toLowerCase()) {
                    case "raj":
                        System.out.println("Transferring to Raj");
                        break;
                    case "alex":
                        System.out.println("Transferring to Alex");
                        break;
                    case "jessi":
                        System.out.println("Transferring to Jessi");
                        break;
                    default:
                        System.out.println("Invalid selection");
                }break;



            case 2:Scanner scanner1 = new Scanner(System.in);
                System.out.println("Please enter what do department you want to talk? 1- IT,2-HR, 3-REP");
                String hrName = scanner1.nextLine().toLowerCase().trim();// we can use also trim
                switch (hrName) {
                    case "ana":
                        System.out.println("Transferring to Ana");
                        break;
                    case "tima":
                        System.out.println("Transferring to Tima");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }

                    case 3:Scanner scanner2 = new Scanner(System.in);
                        System.out.println("Please enter what do department you want to talk? 1- IT,2-HR, 3-REP");
                        String repName = scanner2.nextLine().toLowerCase();// we are use toLower Case due to use give name in lower case.
                        switch (repName) {
                            case "JERRI":
                                System.out.println("Transferring to Jerri");
                                break;
                            case "DAVID":
                                System.out.println("Transferring to David");
                                break;
                            case "JONH":
                                System.out.println("Transferring to Jonh");
                                break;

                            default:
                                System.out.println("Invalid selection");


                        }

        }
    }
}
