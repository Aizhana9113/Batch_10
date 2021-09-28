package Methods;

public class CupTest {

    public static void main(String[] args) {

        Cup cup1 = new Cup(12,true,8 );


        System.out.println(cup1.isClean);
        System.out.println(cup1.liqidAmound);


        Cup cup2 = new Cup();
        System.out.println(cup2.liqidAmound);

        System.out.println(cup1);// HASH code
        System.out.println(cup2);// HASh code

        cup1.info();
        cup2.info();


        Cup cup3 = new Cup(16,true,12);
        System.out.println(cup3);// it will shor inside the return ****** or we want to we give

        Cup cup4 =cup1;


        cup1=null;// it is mean already gone empty , we
         //Cup cup4 =cup1;  // also it will show null like in the trash //


        System.out.println(cup1);

//        System.gc();// it will clean all this class
//
//
    }
}