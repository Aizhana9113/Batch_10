package Loops;

public class NestedForLoop {
    public static void main(String[] args) {

        for(int a = 0; a<5;a++){
            for(int b =0; b<5; b++){
                System.out.println("a--->"+a+"b--->"+b);
            }
            System.out.println("****************");
        }
        //++++++++++++++++++++++++++++++++++++++++++++++++


        for(int a=1; a<5; a++){// here will runing 3 time bc of we started from 1 to 5
                     // if we will give <= it will running included with 5
            for(char c='a'; c<'d';c++){

                System.out.println("number ---> "+a+" letter ---> "+c);
            }
            System.out.println("========================");
        }

    }
}
