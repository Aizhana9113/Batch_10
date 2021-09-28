package Loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        // use for loop to create a multiplecation table for number6
        // from 1 to10
        //

        int number= 6;

        for (int i =1;i<=10;i++) {
            //for (int j = 1; j <= 10; j++) {
                for (int number1 = 1; number1 <= 10; number1++) {
                    for (int number2 = 1; number2 <= 10; number2++) {
                        System.out.println(number1+"*"+number2+"="+number1*number2+ "      "+number1+"*"+number2+"="+number1*number2);

                        //System.out.println(number1+"*"+j+"="+number1*j);

                    //System.out.println(number + "*" + i + "=" + number * i + "       " + number1 + "*" + j + "=" + number1 * j);
                }
            }
        }


// perfect number: a number is equals to its dividers (except number itself) sum
        // 6>>>1,,2,3,>> 1+2+3 =6  6=6 is perfect number
        int perfect =6;
        int sum = 0;
        for (int divisor = 1; divisor<perfect;divisor++){
            if (perfect%divisor==0){
                sum=sum+divisor;

            }
        }
        /*
        System.out.println("Tne sum  sum >>"+sum);
        if (perfect==sum){

            System.out.println("Tne divisor sum >>"+perfect+" the perfect number);
        }else{
            System.out.println("Tne sum >>"+perfect+"the perfect  NOT number);
        }


         */





    }
}
