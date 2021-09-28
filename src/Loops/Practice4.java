package Loops;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        /*
        user has $100
        at long as user has balance more than $0
        ask user how mach many want to spent
        if the amount less than balace  update and show it to user
        if the amount is more than the balace
        >> print "you don't have enough money in the account! youn balace is '''

         */

        Scanner scanner = new Scanner(System.in);
        double balance = 100;
        while(balance>0){

        System.out.println("please enter how mach you want to spent");
        double spending = scanner.nextDouble();
            if(spending<=balance){
                balance -= spending;
                System.out.println("You balance is "+balance);

            }else{
                System.out.println("you don't have enough money in the account! youn balace is "+balance);

            }
        }




    }
}
