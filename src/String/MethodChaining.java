package String;

public class MethodChaining {
    public static void main(String[] args) {
        /*
        TASK: Ask user to enter a String value witch should have space at the beginning  or and
        - Replace all letter 'a' with single '*' and letter 'e' s with double '**'
        - change all string value to UpperCase
        - Find index of First '*'
        - Multiply that value by 10 and
        - Print out the result

         */


        String text = " Just do it";
        int x = text.replace('a', '*').trim().replace("e","**").toUpperCase().indexOf('*');
                                                                          // here we need "" mark bc is not single symbol like char
        System.out.println(x);// number

        char ch = text.replace('a', '*').trim().replace("e","**").toUpperCase().charAt(0);


     String a = text.replace('a', '*').trim().replace("e","**").toUpperCase();

        System.out.println(ch);
        System.out.println(a);

    }
}
