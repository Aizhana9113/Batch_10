package WrapperClass;

public class StringToWrapper {
    public static void main(String[] args) {
        //String str1 = "Sunday";// if we are give some word not integer
        String str1  = "43321"; // it will work bc integer
        Integer i1 = Integer.valueOf(str1);
        System.out.println(i1);

        String str2 = "5.9";
        Float fl1 = Float.valueOf(str2);
        System.out.println(fl1);

        String str3 = "False";
        Boolean bl1 = Boolean.valueOf(str3);
        System.out.println(bl1==false);// true bc bl1 equals false

        //System.out.println(bl1.equals(false));// it will false

        String str4 = ""+'c';
        //Character.valueOf(str4) we can NOT convert string value to Character object




    }
}
