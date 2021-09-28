package Array;

import java.util.Arrays;

public class MultiDimensionPractice {
    public static void main(String[] args) {


        int []ids ={3,4,2,34,56,7};

        int [][]multuDem = {  {60123, 60124, 60125},{9123, 9124,9125},{5123,5124,5125,5126} };// we can't  change this elements
                                                                                             // and add an other element
         multuDem[2][3]= 5234;// since there is not 4th index it throws an exception if we are give witch is element I
                           // would like resing it will chaged
        System.out.println(Arrays.deepToString(multuDem));// we can't put other element
        int [][] multuDem1 = new int [2][5];// we can put and change save and more like new but it will other array store

        //[[60123, 60124, 60125], [9123, 9124, 9125], [5123, 5124, 5125, 5126]]
             //[[0, 0, 0, 0, 0]]




        System.out.println(Arrays.deepToString(multuDem1));



    }
}
