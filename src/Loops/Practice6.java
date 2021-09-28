package Loops;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        /*
        Summer   >>> print out every single letter from this word one by one
        S-u-m-m-e-r
         */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word ");

    String str ="Summer";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));

        */
        String str ="Summer";
        int index = 0;
        while(index<str.length()){

            System.out.print(str.charAt(index)+",");// s,u,m,m,e,r,
            index++;
        }



    }
}
