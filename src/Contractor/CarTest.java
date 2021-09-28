package Contractor;

public class CarTest {
    public static void main(String[] args) {
        CarPractice car1 = new CarPractice("lexus");
        CarPractice car2 = new CarPractice("lexus");
        CarPractice car3 = new CarPractice("lexus");
        CarPractice car4 = new CarPractice("BMW");
        CarPractice car5 = new CarPractice("BMW");
        CarPractice car6 = new CarPractice("BMW");
        car1 = null;


        String str = "Test";// true
        String str2 = "Test";//true
        String str3 = new String("Test");//true
        String str4 = new String("Test");// true

        System.out.println(car4);


        //System.gc();

        //equals() vs

        System.out.println(car2.equals(car3));//false
        System.out.println(car2 == car3);//false bc different object

        System.out.println(str.equals(str2));
        System.out.println(str == str2);
        System.out.println(str.equals(str3));
        System.out.println();


    }
}
