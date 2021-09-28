package Primitives;

public class CastingPractice {
    public static void main(String[] args){


        long l1 = 120;
        // int i1= l1; larger data tepe can not stored in smaller data type

        int i2= (int)l1;// it is coll explicit  casting (Auto narrowing)

        double db1 = l1;// it call implicit casting
        short apple = 800;
        short samsung = 600;
        //apple+samsung


        short total = (short) (apple + samsung);
        System.out.println(total);

        //byte total1 = (byte) (apple+samsung);
        //System.out.println("Total is "+total1); it is not run bc large size for byte . Byte is = -128 ---> 127;

        double d1 =2.3; // i= i+d1 12+2.3 = 14.3
        int i =12;
         i+=d1;
        int i3= (int)d1; // when you do compound assignment you dont need to do explicit casting.
        System.out.println( "i ---> " +i);// 14


        //int i3 =(short)d1; we can cast to the smaller type of the data as a short
        //System.out.println(i3);



    }
}
