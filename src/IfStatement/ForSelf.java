package IfStatement;

public class ForSelf {
    public static void main(String[] args){


        String str1 = "Tutorial GateWay";
        String str2 = "TUTORIAL GATEWAY";
        String str3 = new String("Tutorial GateWay");
        String str4 = new String("TUTORIAL GATEWAY");
        String str5 = new String("Java programming");

        boolean a= str1.equals(str2);
        boolean b = str3.equalsIgnoreCase(str4);


        boolean c = str2.equalsIgnoreCase(str4);
        boolean d= str1.equalsIgnoreCase(str3);


        boolean e= str1.equalsIgnoreCase(str5);
         System.out.println("Does the string object str1 equals to str2?;="+a);
        System.out.println("IgnoreCase: Does the String object str1 equals to str2 ? = "+b);
        System.out.println("Does the string object str2 equals to str4?;="+c);
        System.out.println("Does the string object str1 equals to str3?;="+d);
        System.out.println("Does the string object str1 equals to str5?;="+e);


    }
}

