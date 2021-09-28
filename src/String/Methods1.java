package String;

public class Methods1 {
    public static void main(String[] args){

 // .city.concat methods ------> it is Concat methods


        String city = "Chicago";
        city.concat("is very beautiful");
        System.out.println(city);// Chicago
        // witch means is original value will not change you reasing

        String newCity = city.concat( "is very beautiful");
        System.out.println(city);
        System.out.println(newCity);
       //============================


      // .length(); -----> it is length methods

        System.out.println(city.length());
        int letterCount = newCity.length();
        System.out.println(letterCount);

        //  ----------------------------------------------

        city.charAt(0);//C
        city.charAt(3);//c
        System.out.println(city.charAt(3));
        //city.charAt(9); // error

        //System.out.println(city.charAt(9));// here is will show error bc we are have not letter (Chicago) of 9;

        System.out.println(" it is almous time to go home");// if in our charAt  have error next command will not show










    }
}
