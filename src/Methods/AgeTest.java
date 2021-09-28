package Methods;

public class AgeTest {
    public static void main(String[] args) {
        CalculatorAge tom =new CalculatorAge();
        tom.ageCalculator(1990);
        tom.ageCalculator();
        int b = tom.ageCalculator();
        if (b==25) System.out.println("your happy");
        String x= tom.ageCalculator(2018,"Jonn");
        System.out.println(x);

    }
}
