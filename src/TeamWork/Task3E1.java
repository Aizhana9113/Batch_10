package TeamWork;

public class Task3E1 {
    public static void main(String[] args){
    //Example 2:
    //Please enter your balance:
    //5.22
    //Output:
    //$5.22 will make 20 quarters 2 dimes 0 nickels and 2
    // pennies
    //Description



        double total = 5.22;
        //double quarter 20,dime=2,nickles= 0, penny = 2;
        double quarter  = (int) (total/0.25);
        System.out.println(" Total quarter is -----> "+quarter);
        total = total-(quarter*0.25);
        total= (double) Math.round((total)*100)/100;
        System.out.println("Dollar in quarter is ="+total);

        System.out.println("=====================================================");



        double totalD = 5.22;
        //double quarter 20,dime=2,nickles= 0, penny = 2;
        float dimes  = (float) (totalD/10);
        System.out.println(dimes);



        totalD = total-(dimes*10);
        totalD= (int) Math.round((total)*100)/10;
        System.out.println(totalD);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        double totalP = 5.22;
        //double quarter 20,dime=2,nickles= 0, penny = 2;
        float penny = (float) (totalP/100);
        System.out.println(penny);

        total = total-(penny*100);
        totalP= (float) Math.round((total)*100)/100;
        System.out.println(totalP);













    }
}