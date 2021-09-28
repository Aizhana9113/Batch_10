package String;

public class SubstringMethod {
    public static void main(String[] args) {
        String str = "Tehtorial";
        String part1 = str.substring(2);// we need rename String part1 when you pass single index number inti the substring method
        // it will take partial text starting from that index an it will include that index char
        System.out.println(part1);

        String part2 = str.substring(2,4); // it will show middle number ech 2 and 4 (included 2 and not included4)
        System.out.println(part2);

        System.out.println(str.substring(0)); // it will show original text

        String str1 = "I will do it SOON";


        System.out.println(str1.substring(0));

        /*
        str1.substring(str1.length()-3);

        String str3 = "You can do it";

        str3.substring(str3.length());
        System.out.println(str3.substring(str3.length()));

*/

        System.out.println(str1.substring(str1.length()-3));

        System.out.println(str1.substring(str1.length()-3));

       String str2 ="ON";

        System.out.println(str2.substring(str1.length()-3));// when your string does not have enough value to take substring it nwill
                                                            // throw ban exception (StringOutOfBound)



    }
}
