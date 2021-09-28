package IfStatement;

public class Practice2 {
    public static void main(String[] args) {

        int age = 12;
        double money =200;
        if (age >=18){
            System.out.println("You can go to picnic");
        }
        if (money>=100){

            System.out.println("You can go to picnic with thiht amound "+money);
        }
         //combine these two condition to create at  if statement wich will acsept either of condition age or
        // print "You are okay with of the requirment"



        if (age>=18 ||money>=100){
            System.out.println("You are okay with of the requirment");

        }

    }
}
