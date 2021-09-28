package HomeWork;

public class Homework1 {
    public static void main(String[] args){

        double minutes = 3456789;
        double minutesInYear = 60*24*365;// 525600
        System.out.println(minutesInYear);

        long years = (long) (minutes/minutesInYear);
        int days = (int) (minutes/60/24)%365;
        System.out.println("Years " +years +" Days " + days);



    }
}
