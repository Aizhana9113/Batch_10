package Variables;

public class Practice4 {
    public static void main(String[] args){

        /*
        in farm
        there are 12  cows and 23 chicken;
        each chicken s cost is 10$;
        each cows cost is 500$

        1- calculate the total

         */


        int chicken =23;
        int chickenLegs = 2;
        int totalChickenLegs = chickenLegs*chicken;

        int cow = 12;
        int cowLegs = 4;
        int totalCowLegs =cowLegs*cow;



        System.out.println("Total animals: " + (cow+chicken));
        System.out.println("Total Legs is: " + (cow*cowLegs+chicken*chickenLegs));

        int cowCost$=500;
        int chickenCost$ =10;
        int totalCow = 12;
        int totalChicken = 23;

        int totalPrice= cowCost$*totalCow + chickenCost$*totalChicken;

        System.out.println("Total Price is: " + totalPrice);









    }
}
