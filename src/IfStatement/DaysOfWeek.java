package IfStatement;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {

        /*
        ask user to provde a number btween 1to 7
        - if user enter
        1'''>  it is Monday
        2- it is Tuesday
        3- .....
        4- ....
        5-.....
        6-.....
        7-......
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number between 1 to 7");
        int number = scanner.nextInt();
        if (number==1) {
            System.out.println("It is Monday");
        }
        if(number==2){
            System.out.println("It is Tuesday");
        }
        if(number==3){
            System.out.println("It is Wednesday");
    }
        if(number==4) {
            System.out.println("It is Tuesday");
        }
            if(number==5) {
                System.out.println("It is Friday");
            }
        if(number==6) {
            System.out.println("It is Saturday");
        }
        if(number==7) {
            System.out.println("It is Sunday");
        }





        }
}
