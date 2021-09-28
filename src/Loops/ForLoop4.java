package Loops;

import java.util.Scanner;

public class ForLoop4 {
    public static void main(String[] args) {
        // String str = abc12345&8!
        // count and print letter are in the string
        //count and print how many numbers are in the string
        //count and print out how many other chars are there in the string
        // "There are 4 letters in the string'
        //"there are have 5 numbers in the string"
        //"there are 4 other chars in the string"



                String str = "#######";
                // str = str.toLowerCase();
                int letterCounter = 0;
                int numberCounter = 0;
                int charCounter = 0;

                for (int index = 0; index < str.length(); index++) {
                    if (str.charAt(index) >= 'a' && str.charAt(index) <= 'z' || str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
                        letterCounter++;
                    } else if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                        numberCounter++;
                    } else {
                        charCounter++;
                    }
                }
                System.out.println("There are " + letterCounter + " letters in the string");
                System.out.println("There are " + numberCounter + " numbers in the string");
                System.out.println("There are " + charCounter + " other symbols in the string");
            }
        }


