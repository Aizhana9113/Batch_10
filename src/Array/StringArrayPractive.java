package Array;

import java.util.Arrays;

public class StringArrayPractive {
    public static void main(String[] args) {
        String[]studentNames = new String[6];
        studentNames[5] = "Zolie";
        studentNames[2]= "Sorin";// we can give same name in the array but we need give different storage;
        studentNames[3]="Sorin";
        studentNames[4] = "Adel";
 //here we are opened storage from 2 it witch is  possible but result will show with storage 0 and 1 witch is empty
        // calling NULL [null, null, Sorin, Sorin, adel,Zolie]
        System.out.println(Arrays.toString(studentNames));

        studentNames[4]="David"; //here we are resining here will change just the name.
        System.out.println(Arrays.toString(studentNames)); // it will show David not Adel.

        for (int index =0;index <studentNames.length; index++){
            System.out.println(studentNames[index]); //here will Array show every storage witch we have
        }
    }
}
