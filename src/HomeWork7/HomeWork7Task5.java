package HomeWork7;

import java.util.Scanner;

public class HomeWork7Task5 {
    public static void main(String[] args) {

        /*
        The user using a scanner enters the current speed and target
speed . In every 1-sec car's speed will increase 10mil. Please
find the total number of sec to reach your target speed using a
while loop.
Example:
CurrentSpeed: 6
Target Speed: 20
Output: You need 2 sec to reach target speed.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your current speed and target speed");
        int speedCurrent = scan.nextInt();
        int speedTarget = scan.nextInt();
        int count=0;
      while (speedCurrent<=speedTarget){
          speedCurrent=speedCurrent+10;//16//26
          count++;//1//2
      }

        System.out.println(count);




    }
}
