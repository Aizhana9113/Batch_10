package HomeWork7;

import java.util.Scanner;

public class HomeWork7Task7 {
    public static void main(String[] args) {
        /*
        Using a scanner ask the user to input username and password. Create
the two variables for the expected username and password. if user input
is not matching with the expected username and password ask the user
again until they are correct.
(Optional: if you want to make it a little
complicated. You can allow the user only three times to enter the wrong
username or password. if it is more than 3 times you can print “your
account is on hold now. Try after 5 min”
         */
        Scanner scan = new Scanner(System.in);
       //String name = "Aika";
       //String password = "A1234k";
        int count = 0;
        while(count<=3) {
            count++;

            System.out.println("Please enter your user name");
            String name = scan.nextLine();
           // System.out.println("enter pass");
           // int password=scan.nextInt();
            if (name.equalsIgnoreCase("Aika1234")) {
                System.out.println("Please enter your password");
                String password1= scan.nextLine();
                if (password1.equalsIgnoreCase("A1234k")) {
                    System.out.println("Let's go! ");

                } else {
                    System.out.println("Try again");
                }

            } else {
                System.out.println("You can allow the user only three times to enter the wrong username or password");
            }
        }
        System.out.println("Try after 5 min");














            }
        }

