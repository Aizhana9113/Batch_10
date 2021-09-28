package Primitives;

public class NumericPromotion {
    public static void main(String[] args){

        byte b1 = 112;
        short sh1 = 30;
        //   byte sum1 = b1+sh1;it will not compile bc of the Numeric Promotion

        int sum1 = b1+sh1;// java promote smaller data types byte, short int data type,
        System.out.println(sum1);

        //short sum3 = b1+sh1;

        short sh3= b1;
        float fl1 =  2.3f;
        double db1 = 3.4; //it will not work bc java does not knows.
        // float sum2 = fl1+db1 compile time error.

        double sum2 = fl1+db1;
        System.out.println(sum2);

        // int product sum1=sum2// result is desimal number that's why you can not store it in data type

        double product = sum1+sum2;
        System.out.println(product);


        int i1 =23;
        double db2 = i1;


        // int l1 = db1; // wil not compile
        //long l1 = db2; // will not compile















    }
}
