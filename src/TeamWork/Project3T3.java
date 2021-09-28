package TeamWork;

public class Project3T3 {
    public static void main(String[] args) {

        /*
        Please use method chaining for the following Strings.
         Methods are provided next to the String.String “ Snicker “; —> trim,
          toUpperCase, substring and charAt methodsString

          “Cookie” —> toLowerCase,replace ‘o’ with ‘u’, concat with ’s’, starts with ‘C

         */

       // String firstString = "Snicker";
       // String secondSting  = "Cookie";
        //char firstChar = firstString.trim().substring().charAt();

        //System.out.printf(firstChar);

     // boolean second string= secondString.toLowerCase().replase("0","u").


        String firstString = "  Snicker  ";
        String secondString = "Cookies";
        char firstChar= firstString.trim().toUpperCase().substring(2,5).charAt(2);
        System.out.println(firstChar);
        boolean newSecondString = secondString.toLowerCase().replace("o", "u").concat("s").startsWith("C");
        System.out.println(newSecondString);




    }

}
