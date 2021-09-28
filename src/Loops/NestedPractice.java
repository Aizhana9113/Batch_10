package Loops;

public class NestedPractice {
    public static void main(String[] args) {
        /*
        print the mounths for the every year for the years from 2020 to 2023


         */

        for (int y = 2020; y <= 2023; y++) {
            System.out.println(y);
            System.out.println("##################");
            for (int m = 1; m < 12; m++) {
                System.out.println("++++++++++++++++++");

                for (int week = 1; week <= 4; week++) {
                    //System.out.println(week);
                    System.out.println(m +"in the "+week);

                }

            }
        }
    }
}