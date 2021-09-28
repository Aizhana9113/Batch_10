package IfStatement;

public class CurlyBracketPractice {
    public static void main(String[] args) {

        // appleNumber = 20
        //orangeNumber = 30

        int  appleNumber = 40;
        int  orangeNumber = 30;
        if (appleNumber>orangeNumber) {
            appleNumber++;

            System.out.println("There are more apples in the store then oranges" + appleNumber);
        }

        if (orangeNumber>appleNumber){
            orangeNumber++;// if we have not {  false
            ++orangeNumber;
            System.out.println("There are more oranges inb the store then apples" + orangeNumber);
        }
        }
}
