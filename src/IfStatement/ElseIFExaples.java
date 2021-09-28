package IfStatement;

import java.util.Scanner;

public class ElseIFExaples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first test score betveen 0to 100");
        int firstScore =scanner.nextInt();
        System.out.println("Please enter your second test score betveen 90 to 100");
        int secondScore =scanner.nextInt();
        System.out.println("Please enter your third test score betveen 80 to 90");
        int thirdScore =scanner.nextInt();




        int avarage =(firstScore+secondScore+thirdScore)/3;
         if(avarage>=90 && avarage<=100){
             System.out.println("Your avarage test score ");


         }
    }
}
