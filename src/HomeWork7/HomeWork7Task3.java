package HomeWork7;

import java.util.Scanner;

public class HomeWork7Task3 {
    public static void main(String[] args) {
        /*
        Using scanner ask user to provide the string value.
         Print "dad" if the given string contains the "dad",
         but where the middle 'a' char can be any char.
         Example:Input the year: testdadtest
         Output :dad
         Input the year: testd7dtesty
         Output :dad
         Input the year: testdodtest
         Output :dad
         Input the year: testDudtest
          Output :dad
          testpit
          testdit
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter dad");
        String word = scan.next();
        // dad
        //testdadtest
        if(word.equalsIgnoreCase("dad")){
            System.out.println("dad");
        }else if(word.contains("dad")){
            System.out.println("dad");
        }else if(word.contains("d") || word.contains("D")){
            for (int i=0;i<word.length();i++){
               // word.charAt(i) - d
                // word.charAt(i+2) - d

            }
        }else{
            System.out.println("Do not contains the Dad");
        }
        }

    }





