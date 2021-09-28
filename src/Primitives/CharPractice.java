package Primitives;

public class CharPractice {
    public static void main(String[] args){

        char firstLetter = 'A'; // value for char data type needs to be in the quotation mark ('A')

        System.out.println(firstLetter);
         char secondLetter = '6';

         System.out.println(secondLetter);

         char thirdLetter = '^'; // carrot sine
        System.out.println(thirdLetter);

        char fortLetter = 66;// this is Ok but there char will read from Ascii table

        System.out.println(fortLetter);

        //char fortLetter '66'; // it not work bc char in the '' will read single number.


        char fifthLetter = 255;// also there char will take symbol from ascii table.

        System.out.println(fifthLetter);

        char x = 42;
        System.out.println(x);

        double d = '?';
        System.out.println(d);// there also will take double symbol from ascii table bc there we use '' for char.
                              // or will print the number / value for it.





        int i = '%';
        System.out.println(i);
        int a = 'A';

        // int b = '24' it is does not work bc is not single value.

        int c = '2'; // will work bc is single number.

        int m ='C', k = 'K', g ='G', t = 'T';
        System.out.println(m+k+g+t);// 










    }
}
