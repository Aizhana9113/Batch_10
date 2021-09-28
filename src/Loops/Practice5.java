package Loops;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {


        //Ask user to give a number
        //create multiplication table from 1 to 10

        //5>>> 5*1 = 5
        //5*2 = 10
        //5*3 = 15

/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter you whole number");
        int number = scanner.nextInt();
        int multiplier =1;
        while(multiplier<=10) {
            System.out.println(number + "*" + 1 + "=" + number * multiplier);// it will show 2*1=2
                                                                                             2*1=4
            multiplier++;                                                                    2*1=6

*/

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter you whole number");
            int number = scanner.nextInt();
            int multiplier =1;
           while ( multiplier<=10){// if we are give here <= it will included 10 and also will show 11 too.
               multiplier++;
               System.out.println(number + "*" + multiplier + "=" + number * multiplier);
                                                 // here if we would like
                                                  //change multiplier number
                                                 // we need write here not 1,2,3
                                                //we need give kode incide the while.




    }

    }
    }

