package HomeWork7;

import java.util.Scanner;

public class HomeWork7Task6 {
    public static void main(String[] args) {
        /*
        Using a scanner enter the number of eggs in the box. Then ask the user, how many eggs
are eaten at the end of the day and keep asking the same question until your number of
eggs is equaled to 0 in the box.
Example:
Input: 13
How many eggs did you eat today?
2
There are 11 eggs left
How many eggs did you eat today?
5
There are 6 eggs left
How many eggs did you eat today?
6
You have finished all the eggs

 */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many egggs do you have");
        int eggs= scan.nextInt();
        while (eggs > 0) {
            System.out.println("How many egggs did u eat?");
            int used= scan.nextInt();
            eggs=eggs-used;
            if (eggs>0){
                System.out.println("You have "+eggs+" Eggs");
            } else{
                System.out.println("You eat all eggs ");
            }
            }
        //System.out.println("You don't have eggs ");


        }

}


