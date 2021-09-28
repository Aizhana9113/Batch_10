package String;

public class EqualsMethod {
    public static void main(String[] args) {

        String a = "David";
        String b = "David";

                String c = new String("David");


                String d = new String("David");

        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a==c);
        System.out.println(a.equals(c));
        System.out.println(a==new String("David"));// false

        System.out.println(c==d);// false
        System.out.println(c.equals(d));//true

        System.out.println(a=="David");// true
        System.out.println(c=="David"); //true

        String e = a;
        String f = c;
        System.out.println(e==b);
        System.out.println(f.equals(d));// true





    }
}
