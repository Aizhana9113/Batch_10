package String;

public class Methods4 {
    public static void main(String[] args){
        // ==========================EQUALS(); METHODS =================================


        String a = "Jonn";
        String b = "Jonn";

        boolean bl1 = a.equals("Jonn");
        System.out.println(bl1);

        boolean bl2 = a.equals("Jonn");
        System.out.println(bl2);


        String c = "JONN";
        boolean bl3 = a.equals("Jonn");
        System.out.println(bl3);

//   ++++++++++++++++++++  EQUALSIGNOR METHODS +++++++++++++++++++++++++


        a.equalsIgnoreCase(c);

        boolean bl25=a.equalsIgnoreCase(c);
        System.out.println(bl25);
        System.out.println("Java is ".equalsIgnoreCase("Java is "));// true
        System.out.println("Java is cool");

        //++++++++++++++++++++ REPLACE METHOD+++++++++++++++++++++

        String str1= "Java is cool";

        str1 = str1.replace("o","$");
        System.out.println(str1);
        str1 = str1.replace('a','e');
        System.out.println(str1);

         str1 = str1.replace("c$$l","easy");
        System.out.println(str1);

        String text1="Tava";
        str1= str1.replace("Java", text1);

        System.out.println(str1.replace("***","???" ));
        String star = " Star of day *";

        str1 = str1.replace("*", "?");// it will not work error


        System.out.println(star);

     //+++++++++++++++++++++STRING METHOD
        String text2=" It is Saturday ";
        System.out.println(text2);
        text2 = text2.trim();
        System.out.println(text2);

        /*
        " Do whatever it takes"
        concat with "to learn java"
        make  everythink uppercase
        replace "Java" with "job
        chek if the text contain chicago




         */

        String string = " Do whatever it takes";
        string = string.concat("To learn Java");

        string = string.replace("Java","Job");
        System.out.println(string);

        //string.toUpperCase("Do whatever it takes");
        //System.out.println();









   // for example


    }
}
