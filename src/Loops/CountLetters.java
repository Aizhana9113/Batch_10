package Loops;

import java.util.Locale;

public class CountLetters{
    public static void main(String[] args) {
        // I want to solve this question by myself this time
        // count how many 'i' and 'I' are in the given sentence
        // print >> "there are ... " is in given sentence

        int a =0;
        int count = 0;
        String text = "I want to solve this question by myself this time ";
        text = text.toUpperCase().replace("I"," ");
        int index = 0;
        while (index< text.length()){
            if(text.charAt(index) == 'i'|| text.charAt(index)=='I'){
                count++;
            }
            index++;
        }
        System.out.println("There are "+count+" many i or I in the sentence");

    }
}
