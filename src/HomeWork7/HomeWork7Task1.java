package HomeWork7;

import java.util.Scanner;
/* TASK1
Using Scanner ask user to provide any int number
and print multiplication table of given number
Input number: 5
Output :
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
...
...
5*10 = 50
Description
 */

public class HomeWork7Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = scan.nextInt();
        int times =1;

        while (times<=10){
            System.out.println(number +"*"+times+"="+number*times);
            times++;
        }
    }
}
