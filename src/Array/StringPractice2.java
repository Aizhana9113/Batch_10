package Array;

import java.util.Arrays;
import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {



/*
ask user how many name they want to store
- get names from user to save
- store those names in string Array
- print out those names by using to toString () method
 */
 Scanner scan =new Scanner(System.in);
        System.out.println("How many names want to storage");
        int size = scan.nextInt();
        scan.nextLine();// if we are don't give thise line it will not running again again
  String[] nameStorage = new String[size];

  for (int index =0; index<size;index++){

      System.out.println("Please enter a name");
      nameStorage[index] = scan.nextLine();
  }
        System.out.println(Arrays.toString(nameStorage));

}



}
