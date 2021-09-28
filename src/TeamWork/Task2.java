package TeamWork;

public class Task2 {
    public static void main(String[] args){

        /// TASK 2
        // Write program will add up the value of a number of
        //quarters, dimes, nickels, and pennies.  The number of each
        //type of coin is input by the user.  The total value is printed in
        //dollars.
        //Example:
        //Quarters:   5
        //Dimes:       4
        //Nickels:      3
        //Pennies:    2
        //The total in dollars is $1.82
        //Description

        int quarter = 5;
        int nickles = 3;
        int dimes = 4;
        int penny= 2;

        float  quarterToDollar = quarter*0.25f;
        float nicklesToDollar = nickles*0.05f;
        float dimesToDollar = dimes*0.1f;
        float pennyToDollar = penny*0.01f;
        float result = (float) Math.round((quarterToDollar+nicklesToDollar + dimesToDollar+pennyToDollar)*100)/100;


        System.out.println(" Dollar is ---> "+ result);

    }
}
