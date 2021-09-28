package Loops;

public class ReverseString {
    public static void main(String[] args) {
        // Selenium; reverse it and print it as new string as revered verision
        // muineleS

        //palindromword ---> efe, eye, ana
        //check if the given string is palondrom or not


        String word = "Selenium";
        String newStr ="";
        String str = "1234*4321";
        for (int index = word.length()-1;index>=0;index--){
            //String reverse="Selenium";

        //for(int i= word.length()-1;i>=0;i--){
           newStr=newStr+word.charAt(index);
            System.out.println(newStr);
        }
        System.out.println("Final Version  "+newStr);


        if (newStr.equalsIgnoreCase(newStr)){
            System.out.println("The word is palondrom "+str);

        }else {
            System.out.println("The word is NOT palondrom "+str);

        }



    }
}
