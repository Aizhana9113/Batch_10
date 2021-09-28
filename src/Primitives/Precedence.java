package Primitives;

public class Precedence {
     public static void main(String[] arms){


          int count = 10+15;
          int count1 = count +3*5;
         System.out.println(count);
         System.out.println(count1);

         int count2 = count - count1/2*3;
         //1 - count1/2 --> 40/2=20
         //2 - 20 * 3 = 60;
         // 25-60= -35;
         System.out.println("Count"+count2);

         int count3 = 6/3*5%3;
         // 6/2 = 2
         // 2* 5= 10
         // 10% 3== 3 // reminder is will  1

         System.out.println("Count3 reminder "+count3);

         int count4 = 6-4-count+count3;
         System.out.println("Count4"+count4);

         //=========================================

         // 50 food , 250 for elect, 80 shoes
         //   10%        20%            15%
         //   totalTax (50*0.10)+(250*0.25)+(80*0.15);

         //System.out.println(totalTax);

         // total Payment = 50+250+80+ (50*0.10)+250*0.25)+(80*0.15);

         double payment = 50+250+80+ (50*0.10)+(250*0.25)+(80*0.15);
         System.out.println(payment);

         double number = (20*(1+500) * 2 +30)* 0.7;
         // 1 1+500
         // 2 20*501;
         //

         System.out.println("number is " + number);


         /*
         int n = 3;


         int n+2; // 5

         int n1+=6;

         n1 = n1+6;
         System.out.println(n1);

          */


















     }
}
