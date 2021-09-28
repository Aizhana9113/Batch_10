package IfStatement;

public class LOOP {
    public static void main(String[] args) {

        int count = 0;
        String string = "Today is day to practice a loop";

        for (int o = 0; o < string.length(); o++) {

            if (string.charAt(o) == 'o') {
                System.out.println(string.charAt(o));
                count++;// we can give count++ it will increase twice.
                // a+=2>>>>
            }

        }
        System.out.println("++++++++++++++++++++++++++++++");


        int baket = 0;
        for (int a = 0; a <= string.length()-1; a++) {
            if (string.charAt(a) == 'a') {
                //System.out.println(string.charAt(a));
            }
            System.out.println(string.charAt(a));
            System.out.println("");
        }







        }
    }
