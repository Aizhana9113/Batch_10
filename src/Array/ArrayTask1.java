package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {
/*

ask user how many name they want to store
- get names from user to save
- store those names in string Array
- print out those names by using to toString () method
if name has more than 5 letter; save at to an array as longName
if the  name has less than 5 letters; save it to an array named a ShortName
print out thous longName and shortName arrays by by toString () method
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many storage you want give ");
        int size = scan.nextInt();

        String longNames[] = new String[size];
        String shortName[] = new String[size];

        for (int index = 0; index < size; index++) {
            System.out.println("Please enter a name ");
            String name = scan.next();// we are here saving name for storage
            if (name.length() >= 5) {
                longNames[index] = name;

            } else {
                shortName[index] = name;
            }

            System.out.println("this  is longNAmes "+Arrays.toString(longNames));
            System.out.println("This is short names"+Arrays.toString(shortName));

        }

    }
}
