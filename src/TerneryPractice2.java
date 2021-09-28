import java.util.Scanner;

public class TerneryPractice2 {
    public static void main(String[] args) {


        /*
    Task: solve following question by using ternary operator
       At the electronics shop there are two different brands of TV options for customers
        1 - Samsung TVs
        2 - Other TVs
       Ask customer: 'Which brand are you interested in?"
       based on their response:
       if they They said Samsung: Print --> "Samsung TV prices are starting from $1199"
                      otherwise : Print --> "Other TV prices are starting from $599"
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Whitch  brand are you interesting ? Samsung/others");
        String answer = input.nextLine();

        // condition ?  option1 : option2

        String print = answer.equalsIgnoreCase("Samsung") ? "Samsung TV prices  are starting from $1199" : "Others TV are starting from $599";
        System.out.println(print);




    }
}
