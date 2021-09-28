package WrapperClass;

public class StringToPrimitives {

    public static void main(String[] args) {


        String str1 ="123";
        //int i = str1;
        //Integer i = new Integer(str1);
        //System.out.println(i*2);

     int i = Integer.parseInt(str1);

     double db1 = Double.parseDouble(str1);
    String str2 = "true";
    boolean b1= Boolean.parseBoolean(str2);// true

        System.out.println(b1);


        boolean b2 = Boolean.parseBoolean(str1);
        System.out.println(b2);


        boolean b3 = Boolean.parseBoolean("false");
        System.out.println(b3);//true
    }
}