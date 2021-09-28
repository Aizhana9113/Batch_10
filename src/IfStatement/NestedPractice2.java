package IfStatement;

import java.util.Scanner;

public class NestedPractice2 {
    public static void main(String[] args) {
        /*
        ask to candidate
        if she knows java
        if yes>> ask she knows API testing
           yes>> ask she knows SQL
           yes >> CONGRATS!!!

        is java  no >> print learn Java end come back
        if Selenium no >> we need someone who has Selenium knowledge
        if API  testing no>> we need  someone who knows API testing
        if SQL  is no >> print we need  someone who has SQL knowledge
        if she knows all print Congrats!

         */


        Scanner java = new Scanner(System.in);
        System.out.println("Do you know java? Yes/No");
        String firstQuestion = java.next();
        if (firstQuestion.equalsIgnoreCase("yes")) {
            System.out.println("Do you know Selenium?");
            String selenium = java.next();
            if (selenium.equalsIgnoreCase("yes")) {
                System.out.println("Do you know API testing");
                String api = java.next();
                if (api.equalsIgnoreCase("yes")) {
                    System.out.println("Do you know SQL test");
                    String sql = java.next();
                    if (sql.equalsIgnoreCase("yes")) {
                        System.out.println("Congratulation! You are hire.");

                    }
                } else {
                    System.out.println("We need some one who knows SQI.");
                }
            } else {
                System.out.println("We need some one who knows API testing");
            }
        } else{
            System.out.println("We need some one who knows java");
    }
}

    }
