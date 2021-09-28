package Array;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {
        String data = "12.03.2021";
        // check if the mouth is 12 and print out ; it is correct month
        // \\.


        String str = "12.03.2021";
        String [] splitedData = data.split("\\.");
        System.out.println(Arrays.toString(splitedData));
        if (splitedData[0].equals("12")){
            System.out.println("It is correct month");

        }
        String date1= "11/03/2021";
        String[] splitDate1=date1.split("/");
        System.out.println(Arrays.toString(splitDate1));


        String text ="My favorite color is \"blue\". \n How about you?\t \\";
        System.out.println(text);


    }
}
