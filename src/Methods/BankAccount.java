package Methods;

public class BankAccount {
    String bankName = "Techtorial"; // object
    int accountNumber;
    double balance;
    String accountHolderName;
    boolean loggedIn;
    String userName;
    String passWord;


    // create a method that will display all of the account information;
    //create a method deposit  deposit, it will update the balance;
    //create a method name withDraw  deposit, it will update the balance;
    // create a method name  as login it will check if the use  logged  in or not , it will return true;


        public void accountInfo (){
            System.out.println("bank name "+bankName+"\n account number" +accountNumber+"\n balance is "+balance
            +"\n account Holder name is "+accountHolderName+"\n Logget in is "+loggedIn);
        }

    public double deposit (double depositAmount ){
            balance +=depositAmount;
        System.out.println("your new balance after deposit Amount of "+depositAmount+"is "+balance);
            return balance;

    }
    public double withDraw (double withDrawAmount ) {
        balance += withDrawAmount;
        System.out.println("your new balance after withdrawal Amount of " + withDrawAmount + "is " + balance);
        return balance;
    }
    public boolean logIn(String user, String pass){
            if( userName.equals(user)&& passWord.equals(pass)){


                loggedIn = true;

        }else{
                System.out.println("Your credentials are not matching");
            }
            return loggedIn;


    }

//    public static void main(String[] args) {
//        BankAccount java = new BankAccount();
//        java.accountInfo();
//        java.accountNumber =123456;
//        java.accountHolderName = "Joe";
//        java.username = "abc";
//        java.passWord = "123";
//        java.balance = 1.000;
//
//        java.accountInfo();
//        java.deposit(5000);
//        java.withDraw(60);
//        java.logIn( "abc", "123");
//        java.accountInfo();
//
//    }
}
