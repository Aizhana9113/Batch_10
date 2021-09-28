package Loops;

public class DoWhilePractice {
    public static void main(String[] args) {

        //int number = 10;

        //while (number>0){
            //System.out.println(number);
           // number--;


       // do{
         //   System.out.println(number);
           // number--;
       // }while(number >= 0);


       //  number= 10;
      //  do{
     //       System.out.println(number);
      //      number--;
     //   }while(number < 0);

        // find the sum of numbers from 10 to 15
        // print the result as "Total is ..."

        int total=0;
        int num1 =10;

        do{

            total = total+num1;
            num1++;
           // System.out.println("Total is "+total);// it will show total 10
        }while (num1 <= 15);
        System.out.println("Total is "+total);

    }
    }

