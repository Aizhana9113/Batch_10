package String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){


        //String.str1="Apple like ***";
      //String strtoUpperCase("Apple like ***"));
        //System.out.println("Apple like ***");


      //String string.con


        Scanner scanner = new Scanner(System.in);
        System.out.println("Apple like ***");
        String  text = scanner.nextLine();
        System.out.println(text);

        text= text.replace('a','*');
        text.replace("e","**");
        System.out.println(text);

        text = text.toUpperCase();
        System.out.println(text);


        int indexOfStar= text.indexOf('*');
        System.out.println(indexOfStar);
        System.out.println(indexOfStar*10);

        // find and print out middle chars index number
          // text is Chicago
        text.charAt(4);
        text.charAt(text.length()/2);

        text.indexOf("a");
        text.indexOf(text.charAt(text.length()/2));

        text.indexOf("a");
        int index= text.indexOf(text.charAt(text.charAt(text.length()-1)/2));

        System.out.println(index);
        ;






    }
}
