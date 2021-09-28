public class TerneryPractice1 {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 5;
        int num3 = 6;

        int result1 = num1==num2 ? 25 : 30;
        System.out.println("Result1 is "+ result1);

        String result2 = num1==num3 ?  "Hello": "Bye";
        System.out.println(result2);// bye bc here false


        //num1==num2 ?  "Good morning": 5; //this time we just can put inside sout bc here we are have int and string
        // we can not give store,  but these also we can see correct unswer it will work
        System.out.println(num1==num3 ?  "Good morning": 5);


        int result3 = num1==num3 ? num1++ +num2++: num3++ +num3; // here we will come back for out first command int
        System.out.println(result3); // false                            //




    }
}
