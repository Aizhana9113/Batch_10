package WrapperClass;

public class WrapperPractice1 {
    public static void main(String[] args) {
        byte b1=2;
        Byte bt1 = new Byte(b1);// parameters
        System.out.println(bt1);
        short s1 = 4;
        Short sh1 =new Short(s1);// we gave 4 it not work bc java will take from int whole number
                                // we need casting

        Short sh2 = new Short((short)5);
        System.out.println(sh2);

        Integer i1 = new Integer(12);
        System.out.println(i1);//12

        long l1 =123;
        Long lg1 =new Long(l1);
        Long lg2 = new Long(123);
        System.out.println(lg1);//123



        Double db1= new Double(3.5);
        System.out.println(db1);


        Float fl1 = new Float(2.5);
        System.out.println(fl1);// 2.5


        Boolean bl1 = new Boolean(true ) ;
        System.out.println(bl1==true);//true


        Boolean bl2 = new Boolean("WWW");
        System.out.println(bl2==false);// it will true bc www not equals false


        Character ch1 = new Character('R');
        System.out.println(ch1);

        char c= 'T';
        Character ch2 = new Character(c);
        Character ch3 = new Character('5');
        //Character ch4 = new Character(65); it will not compale with ASCII table
        System.out.println(ch3);



        // +++++++++++++ AUTO BOXING it is when you use converting data to object (Wrapper class)

        Integer  i2 = 25;// autoBoxing
        int x = i2;// unboxing
        //Boolean bl2 = true;// Auto boxing

        // """""""""""""""" UnBoxing ---> converting Wrapper class object to  primitive data


        int  a = new Integer(11);//UnBoxing

        char c1 = ch1; // UnBoxing

        System.out.println(ch1);




    }
}
