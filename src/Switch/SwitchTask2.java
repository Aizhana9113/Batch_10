package Switch;

import java.util.Scanner;

public class SwitchTask2 {
    public static void main(String[] args) {
        /*
        ask user to provide to favorite color
        if it is blue
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite color");
        String name  = scanner.nextLine();

        String answer = scanner.nextLine();
        switch(answer){
            case "blue":
                System.out.println("My favorite color blue, too");
                break;
            case "red":
                System.out.println("i also like color red");
                break;
            case "pink":
                System.out.println(" Pink most woman like pink");
                break;
            case "green":
                System.out.println("Green is more natural color");
                break;
            default:
                System.out.println("This is no matching color ");
        }
    }
}
