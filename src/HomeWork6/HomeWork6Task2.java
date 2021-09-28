package HomeWork6;

import javax.print.DocFlavor;
import java.util.Scanner;

public class HomeWork6Task2 {
    public static void main(String[] args) {
        /*
        Using scanner ask user to enter any String value. If this String
has the color like red or blue with lower case print the red or blue.
EXAMPLE-1:
Input: "xxredyy"
Output: red
EXAMPLE-2:
Input: "xbxltue"
Output: blue
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your string value");
        String color = scan.nextLine();
        if (color.equalsIgnoreCase("red")) {
            System.out.println("red");
        } else if (color.contains("red")) {
            System.out.println("red");
        }
        if (color.equalsIgnoreCase("blue")) {
            System.out.println("blue");
        } else if (color.contains("blue")) {
            System.out.println("blue");
//        } else if (color.toLowerCase()) {
//            System.out.println("blue");
//            }
        }
    }
}
