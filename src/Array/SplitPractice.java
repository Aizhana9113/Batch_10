package Array;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {

        String str = "The fall, season coming";
        String[] word = str.split("");// if we will give space in the "" it will show every enter
        System.out.println(Arrays.toString(word));
        String[] word2 = str.split("a");// it will skip all letter a and will count from where was letter a
        System.out.println(Arrays.toString(word2));

    }
}
