package TeamWork;

import java.util.Scanner;

public class Project5Task6 {
    public static void main(String[] args) {
        /*
        Using the scanner ask the user to enter one string value and print only
unique letters combined as String also without any space in the
beginning and at the end.
Example -1 :
Given Value: "i am happy"
Output: i am hpy
Example-2:
Given Value: " contribute"
Output: contribue
Example-3:
Given Value: " i want cup of coffee "
Output: i want cup of e
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a String");
        String word = scan.nextLine();
        //String word="I am  happy";
        String free="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==' '){
                free+=word.charAt(i);
                continue;
            }
            if(!free.contains(word.charAt(i)+"")){
                free+=word.charAt(i);
            }
        }
        System.out.println(free);
    }
}


