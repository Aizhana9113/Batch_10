package TeamWork;

public class Task3 {
    public static void main(String[] args){

        // I need to write a program that will take a given amount
        //of money and return the number of dollars in quarters,
        //dimes, nickels, and pennies that make up that given
        //amount
        //Example 1:
        //     Please enter your balance:
        //     2.36
        //     $2.36 will make 9 quarters 1 dime 0 nickels
        //and 1 pennies
        //Description

        double total = 2.36;
        //double quarter 9,dime=1,nickles= 0, penny = 1;
        double quarter  = (int) (total/0.25);
        System.out.println(quarter);
        total = total-(quarter*0.25);
        total= (double) Math.round((total)*100)/100;
        System.out.println(total);




    }
}
