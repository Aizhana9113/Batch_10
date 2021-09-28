package MentoringAhmed;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        String name = "java is cool";
        String[] words = name.split(" ");
        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++){
        String reverse = "";

        for (int k = words[i].length() - 1; k >= 0; k--) {
            reverse += words[i].charAt(k);
        }

            System.out.println(reverse.charAt(0));
            System.out.println(reverse.charAt(reverse.length()-1));
            System.out.println(reverse);
    }

    }

}

//    String[]studentNames = new String[6];
//        studentNames[5] = "Zolie";
//                studentNames[2]= "Sorin";// we can give same name in the array but we need give different storage;
//                studentNames[3]="Sorin";
//                studentNames[4] = "Adel";
//                //here we are opened storage from 2 it witch is  possible but result will show with storage 0 and 1 witch is empty
//                // calling NULL [null, null, Sorin, Sorin, adel,Zolie]
//                System.out.println(Arrays.toString(studentNames));
//
//                studentNames[4]="David"; //here we are resining here will change just the name.
//                System.out.println(Arrays.toString(studentNames)); // it will show David not Adel.
//
//                for (int index =0;index <studentNames.length; index++){
//        System.out.println(studentNames[index]); //here will Array show every storage witch we have
//        }