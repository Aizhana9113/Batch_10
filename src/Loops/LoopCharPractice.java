package Loops;

public class LoopCharPractice {
    public static void main(String[] args) {
        // print out alphabet in upper case letters


        for(char ch ='A', ch1= 'a'; ch<='Z' && ch1<='z'; ch++ , ch1++){
            System.out.print(ch +"-");
            System.out.println(ch1 +"-");

        }
    }
}
