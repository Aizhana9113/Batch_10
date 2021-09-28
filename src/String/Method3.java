package String;

import java.util.Locale;

public class Method3 {
    public static void main(String[] args){
         String string = "Selenium";
         // .toUpperCase();
        System.out.println();
        //.toLowerCase();

        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase(Locale.ROOT));
        System.out.println(string);

        //string.charAt(0) it error we can not use this char for get UPPER CASE OR LOWER CASE
        // b.c char is single symbol

        String a = ""+ string.charAt(0);
        a = a.toUpperCase();
        System.out.println(a);
        System.out.println(a+string);


//===============================  .starWith METHOD     ==========================================


        String word = "do whatever it takes";

        System.out.println(word.startsWith("do"));

        word.startsWith("do");// true

        word.startsWith("what");// false

        word.startsWith("Do");//false

        boolean result1 = word.startsWith("do");
        System.out.println(result1);

        boolean result2 = word.startsWith("Do");
        System.out.println(result2);

        System.out.println(word.startsWith("do whatever it takes"));// it will true bc first letter matchin with word


        //-------------------------------------------

        word.endsWith("do");// false

        System.out.println(word.endsWith("S")); // false

        System.out.println(word.endsWith("do"));
        System.out.println(word.endsWith("takeS"));// FALSE bc capital

        System.out.println(word.endsWith("es"));// true

      //++++++++++++++++++++.cotains(); method ++++++++++++++++++++++++++

      String text = "Techtorial";

        System.out.println(text.contains("ch"));// false
        System.out.println(text.contains("t"));// true

        text=text+word;
        System.out.println(text.contains("do"));// true

        // System.out.println(text.contains('i');// false bc we can not  use char '' we need ""

        System.out.println(text.contains("i"));




    }
}
