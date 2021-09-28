package Methods;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount java = new BankAccount();
        java.accountInfo();
        java.accountNumber =123456;
        java.accountHolderName = "Joe";
        java.userName = "abc";
        java.passWord = "123";
        java.balance = 1.000;

        java.accountInfo();
        java.deposit(5000);
        java.withDraw(60);
        java.logIn( "abc", "123");
        java.accountInfo();

    }
}
