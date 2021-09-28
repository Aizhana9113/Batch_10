package Primitives;

public class CompoundAssiment {
    public static void main(String[] args){

        int carNumber = 7;
        carNumber = carNumber + 5;
        System.out.println(carNumber);

        carNumber+=5;
        System.out.println(carNumber);//17

        carNumber /= 2;
        System.out.println(carNumber);// 8

        int count;
        count = carNumber * 2;
        System.out.println(count);// 16


        int count1 ;
        // count1 +=10 it is not compile bc count1 does not have value

        count -=carNumber; //count =count - carNumber;  16-8=8
        System.out.println(count);
        int payment = 50;
        payment*=carNumber; //50*8=400
        System.out.println(payment);



        int modulus = 1;
        modulus %= payment;
        System.out.println(modulus);

        int modulus1 = 1000;
        modulus1 %= payment;// first java divides 1000 by 400 and find the remainder then it assigns the value for modulus value will 200
        System.out.println(modulus1);
        // 1-1000/400= 200
        // 2-




    }
}
