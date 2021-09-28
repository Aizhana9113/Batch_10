package String;

import java.util.Scanner;

public class Task {
    public static void main(String[] args){
        /*
        Task get a string from User via scanner and;
        -print
        - first char
        -last char
        -index of second
        - length of string
        index of x
         */

        Scanner booby = new Scanner(System.in);


        System.out.println(" Please enter a String value");


        String str  = booby.nextLine();// it is take data type
        System.out.println(str.charAt(0));// first char
        System.out.println(str.charAt(str.length() -1));// last char
        str.indexOf("c,",str.indexOf("c")+1);
        System.out.println(str.indexOf("c,",str.indexOf("c")+1));
        System.out.println(str.length());
        System.out.println(str.indexOf('x'));






        //String name = "Print";
        //name.indexOf('P');
        //System.out.println(name.indexOf('P'));
        //System.out.println(name.indexOf('t'));




    }
}
