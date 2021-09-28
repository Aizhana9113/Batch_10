package Array;

import java.util.Arrays;

public class ReversTask3 {
    public static void main(String[] args) {

        String[] colors = {"Red", "Yellow", "brown", "White", "Orange", "Pink", "Green", "Black", "aAbc", "aBac", "12"};
        // task; print out every element in revers verision
        for (String color : colors) {
            String revers = "";


            for (int i = color.length() - 1; i > 0; i--) {

                revers = revers + color.charAt(i);

            }
            System.out.print(revers + ",");
        }
    }
}