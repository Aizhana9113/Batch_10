package Array;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {

        int [] number= new int [5];// you can't update this number or name of array
        System.out.println(number);

        number[0]=11;
        System.out.println(number);// hash code
        System.out.println(number[0]);//11
        System.out.println(number[1]);//0
        number[1]=22;
        number[4]=44;
        System.out.println(number[4]);//44

        //number[5]=55;// it will give Array IndexOutof boundsExeption since there is not 5th index
        //System.out.println(number[5]);

        System.out.println(Arrays.toString(number));//will show all numbers the  storage witch we have

        System.out.println(number.length);

        for (int index = 0; index<number.length;index ++ ){// it will show storage one by one

            System.out.println("from for loop"+number[index]);
        }
    }
}
