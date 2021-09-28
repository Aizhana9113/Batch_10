package Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {


        int[]zipCode = {123,345,789,};// ---> 3 size
        System.out.println(zipCode.length);
        System.out.println(zipCode[0]);
        //System.out.println(zipCode[5]);// we block here bc after that sout wont work
        System.out.println(Arrays.toString(zipCode));//
        zipCode[1] =999; // we are add size resing
        System.out.println(Arrays.toString(zipCode));// it will show with new size

        Object[] objects = {"red", "Blue", 55, 'A',6,57, null, false};
        for(int index = 0 ; index< objects.length; index++){
            System.out.println(objects[index]);
        }

        boolean[] condition ={true,false,false,true,5==5,5!=5};// 5==5 will show true , 5!=5 will show false
        System.out.println(Arrays.toString(condition));


        char[] characters = {'a','$','!','7','1', 10,65 };// 10 and 65 will show result from ascii table
        System.out.println(Arrays.toString(characters));

        int[] chars ={'A'};
        System.out.println(Arrays.toString(chars));// here A will show some number from ascii table bc we give size integer (INT)

    }
}
