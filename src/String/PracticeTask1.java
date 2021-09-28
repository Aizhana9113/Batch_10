package String;

import java.util.Scanner;

public class PracticeTask1 {
    public static void main(String[] args){

        Scanner David = new Scanner(System.in);
        double balace = 200;
        System.out.println(" How mach do you want deposit? ");
        double  deposit1 = David.nextDouble();
       ; balace += deposit1;

        System.out.println(" your current balace is "+balace);



        System.out.println(" How mach do you want deposit? ");
        double  deposit2 = David.nextDouble();
        balace += deposit2;
        System.out.println(" your current balace is "+balace);

        System.out.println(" How mach do you want deposit? ");
        double  deposit3 = David.nextDouble();
        balace += deposit3;
        System.out.println(" your current balace is "+balace);


        System.out.println(" What is your phone price?");
        double phonePrice= David.nextDouble();
        balace-=phonePrice;

        System.out.println(" What is your headphone price?");
        double headphonePrice = David.nextDouble();
        balace-=headphonePrice;


        System.out.println(" What is your current balace is :"+balace);




    }

}
