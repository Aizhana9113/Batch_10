package MentoringAhmed;

import java.util.Scanner;

//public class ATMProject {
    //public static void main(String[] args) {


        //Create card number and password

        /*
        String savedcardNumber = "0";

        String savedpassword = "0";
        Scanner scan = new Scanner(System.in);
        int chances = 3;
        int choice;
        double balance = 100;
        int[] options = new int[]{5, 10, 20, 50, 100};
        String[] bills = new String[]{"gaz", "eletrycity", "internet", "water"};
        double[] cost = new double[]{10.20, 35, 45, 75, 105};


        do {

            System.out.println("please enter your card number");
            String cardNuber = scan.next();
            System.out.println("please enter your paswword");
            String pasword = scan.next();


            if (cardNuber.equals(savedcardNumber) && pasword.equals(savedpassword)) {

                System.out.println("Welcome to Bank ATM");

                do{

                    System.out.println("What would you like to do today");
                    System.out.println("1 - Withdraw \n2 - Deposit\n3 - Balance\n4 - Payment\n5- Change the password\n6 - Exit");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            for (int i = 0; i < options.length; i++) {
                                System.out.print(options[i] + "$    ");
                            }
                            System.out.println("Withdrawal amount?");
                            int money = scan.nextInt();
                            if (balance > money) {

                                balance -= money;
                                System.out.println("you succsecfully withdrew the money!!\n Your new balance is" + balance + "$");
                                break;
                            } else {
                                System.out.println("You dont have enough money");
                                break;
                            }
                        case 2:

                            for (int i = 0; i < options.length; i++) {
                                System.out.print(options[i] + "$    ");
                            }
                            System.out.println("Deposit amount?");
                            money = scan.nextInt();
                            balance += money;
                            System.out.println("You got this much money" + balance);

                        case 3:
                            System.out.println("Your balance is " + balance + " $");
                        case 4:
                            for (int i = 0; i < bills.length; i++) {
                                System.out.println(bills[i] + "=" + cost[i]);
                            }
                        case 5:

                        case 6:
                            break;
                    }
                } while (true);

            } else {
                chances--;
                System.out.println("wrong info try again" + "you have " + chances + "chances");

                if (chances == 0) {
                    System.out.println("You card is hold by ATM");
                    break;
                }
                System.out.println("what bill you would like to pay");
                String option = scan.next();
                for (int k = 0; k < bills.length; k++) {
                    if (option.equalsIgnoreCase(bills[k])) {
                        if (balance > cost[k]) {
                            balance -= cost[k];
                            System.out.println("You are successully paid" + bills[k] + "you new balance " + balance);

                        } else {
                            System.out.println("You dont have  balance ");
                            break;
                        }
                    }

                    }while (true);
                }
            }
        }

    }
}

*/









