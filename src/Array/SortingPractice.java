package Array;

import java.util.Arrays;
import java.util.Locale;

public class SortingPractice {
    public static void main(String[] args) {

        int numbers[] = {45,5,9,12,56,0,30};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);// sort method will put element is ascending order(from smaller to larger)
        System.out.println(Arrays.toString(numbers));

        String[] colors = {"Red","Yellow","brown", "White", "Orange", "Pink","Green", "Black","aAbc","aBac", "12","34"};
        //it will show first numbers than string than lower case than
        System.out.println(Arrays.toString(colors));
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors).toLowerCase());


        for(int index =0; index<colors.length; index++){

            colors[index] = colors[index].toLowerCase();

        }
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
    }
}
