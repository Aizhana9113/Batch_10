package TeamWork;

import java.util.Scanner;

public class Project3T4 {
    public static void main(String[] args) {

        /*
        Using scanner ask the user to enter 3 String words and print true
        if length of 3 string is same and all of them contains the "java" and all of them
        starts with upper case any letter.
        For Example:
        "I love java." -> length is 10
        "We use java." -> length is 10
        "Java is best" -> length is 10
      Since all the sentences contain the java and start with upper case and length is the same the output will be true.
         Output:
         true
         */
       /*
        Scanner scan =  new Scanner(System.in);

        System.out.println("Please enter the first string ");
        String str1 = scan.nextLine();
        System.out.println("Please enter the second string ");
        String str2 = scan.nextLine();
        System.out.println("Please enter the third string ");
        String str3 = scan.nextLine();

        boolean b= str1.length()==str2.length() || str2.length()==str3.length();

        boolean equalLenght = str1.contains("java") || str2.contains("Java")&& str3.contains("java");
        boolean hasJavaSmall = str1.contains("java") || str2.contains("Java")&& str3.contains("java");
        boolean hasJavaBig = str1.contains("java") || str2.contains("Java")&& str3.contains("java");
        boolean str2IsCap =  str2.charAt(0)>= smallCapLetterOnAscii||str1.charAt(0)<=greatestCapitalLetterOnAscii;

        //boolean isThe Lenght = str1.length();

        String str1 = "I love java ";
        String str2 = "We use java ";
        String str3 = "Java is best";

*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first String");
        String str1= scan.nextLine();
        System.out.println("Please enter the second String");
        String str2= scan.nextLine();
        System.out.println("Please enter the third String");
        String str3= scan.nextLine();

        int smallestCapLetterOnAscii = 65;
        int greatestCapLetterOnAscii = 90;

        //Here we are checking if all length of strings are equal
        boolean equalLength= str1.length() == str2.length() && str2.length() == str3.length();

        //Here we are checking if the 0th index is Upper Case
        boolean str1IsCap = str1.charAt(0) >= smallestCapLetterOnAscii || str1.charAt(0) <= greatestCapLetterOnAscii;
        boolean str2IsCap = str2.charAt(0) >= smallestCapLetterOnAscii || str2.charAt(0) <= greatestCapLetterOnAscii;
        boolean str3IsCap = str3.charAt(0) >= smallestCapLetterOnAscii || str3.charAt(0) <= greatestCapLetterOnAscii;

        //Here I changed all Strings to lowerCase so we can check if they contains "java"
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();
        str3= str3.toLowerCase();
        boolean hasJava = str1.contains("java") && str2.contains("java") && str3.contains("java");


        boolean finalOutput = equalLength && (str1IsCap&&str2IsCap&&str3IsCap) &&  hasJava;

        System.out.println(finalOutput);

        // I love java.
        // We use java.
        // Java is best







    }
}
