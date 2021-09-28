package String;

import java.util.Scanner;

public class ScannerPractise3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name ");

        String fullName = scanner.next();// if change for nextline it is function read all the text in the score

        // we need _ for scanner.next.

        System.out.println(" you entered this value --> "+fullName);
        char firstLetter = scanner.next().charAt(0); // indexing // there char will read from zero what why index number is will show different
        // maybe like if we will give command inside the charAt 1 it will take from second letter .
                                                     // illinois ---> letter count is 8
                                                     // 01234567 ----> index numbers
        System.out.println(firstLetter);








    }
}
