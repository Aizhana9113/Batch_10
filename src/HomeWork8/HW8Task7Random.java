package HomeWork8;

import java.util.Scanner;

public class HW8Task7Random {
    public static void main(String[] args) {
        //Write a program in Java to make such a pattern like a pyramid with numbers increased by 1.
        // For this task ask the user to enter a number of the line.
        //            Example:
        //    Please enter line number: 4
        //    Expected output:
        //            1 // If you are in line 1 you print the number 1 time
        //            23 // If you are in line 2 you print the number 2 times
        //            456
        //            7 8 9 10

        // First we need to have a line number
        // After we finish printing in current line we nneed to jump on next line

             Scanner scanner=new Scanner(System.in);
            int allLine=scanner.nextInt();
            int numbersToBePrinted=0;
            for (int l = 1; l <=allLine ; l++) {
                // This loop wil repeat line times
                for (int i = 1; i <=l ; i++) {
                    System.out.print(++numbersToBePrinted);
                }
                // This is used for jumping the next line
                System.out.println();
            }
        }
    }
