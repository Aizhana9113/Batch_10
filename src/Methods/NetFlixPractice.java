package Methods;

public class NetFlixPractice {
    /*
    Netflix
//
//
// create a instance field account name , user name. mountly Usege
//
//
// create a method that will update usage of the data for each user that uses
// this will take parameter for amount for data usege
//
// test your code
     */

    String accountName;
    String userName;
    static double monthlyData = 200;

    public void usage(double data) {
        //monthlyData = monthlyData-data;
        //public double usage ( double data){
            //return monthlyData= monthlyData - data;

        }

    public static void main(String[] args) {


            NetFlixPractice flix = new NetFlixPractice();
            // flix is object
            flix.usage(12);
            System.out.println(flix.monthlyData);
            System.out.println(flix.accountName);
            flix.usage(10);
            System.out.println(flix.monthlyData);

            NetFlixPractice net = new NetFlixPractice();
            net.usage(2);
            System.out.println(net.monthlyData);
        }

    }
