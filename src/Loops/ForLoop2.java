package Loops;

public class ForLoop2 {
    public static void main(String[] args) {
        String word = "Chicago";
        // print out the form a given String value
        // Chicago
        // print out the letter starting from end of the string

        //varible    condition               updating
        for (int i = 0; i <= word.length() - 1; i++) {
            System.out.println(word.charAt(i));
        }
        System.out.println("*******************************");
        // condition                  variable        updating
        for (int index = word.length() - 1; index >= 0; index--) { // for starting from end we need change varible with condition
            System.out.println(word.charAt(index));
        }


        System.out.println("++++++++++++++++++++++");

        // print out  only letter 'o' from this string

        int count =0;
        String string = "Today is day to practice a loop";

        for (int o = 0; o < string.length() ; o++) {

            if (string.charAt(o) == 'o') {
                System.out.println(string.charAt(o));
                count++;
            }
            //System.out.println("count is "+count);  // it will show or take  every letter
        }
        System.out.println("count is "+count);// it will show how many o we have in the word

        // print index number of o is "     (show index number of each letter 'o' )
int count1=0;
        for (int o = 0; o < string.length() ; o++) {

            if (string.charAt(o) == 'o') {
                System.out.println(string.charAt(o));
                System.out.println("the index of "+count1+" o "+o);// if we are give before than count++ it will show number is between letter o
                                                                   // and witch letter the  0 from zero.
                count1++;
                System.out.println("the index of "+count1+" o "+o);       // if we are give before than count++ it will show number is between letter o
                                                                             // and witch letter o here will cout from one.
                                                 // here count will be show
                                                // witch the letter o
            }
        }
        System.out.println("count is "+count1);







    }
}
