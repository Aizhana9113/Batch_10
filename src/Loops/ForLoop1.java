package Loops;

public class ForLoop1 {
    public static void main(String[] args) {

        for (int number = 1 ;number<=5 ;number++ ) {// we can change here start number 0 with any number
                            // also here number=1 will work any time bc this is local and incide the loop
            System.out.println("it is for LOOP"+number);// it will show witch the number
            }
        int number = 1;// we can't use this number second time bc it is out side from for it meaning is .
        for ( ;number<=5 ;number++ ) {
            System.out.println("it is second for LOOP"+number);// it will show witch the number
        }
        for ( ;number<10 ; ) {
            number++;
        }
            System.out.println("it is third for LOOP"+number);

        for ( ; number<15 ; ) {//if we won't give here any condition it not work bc it is infinit .
            number++;
        }
        System.out.println("it is  for LOOP"+number);// it will infinit loops



        }
    }