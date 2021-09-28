package Primitives;

public class UnaryOperators {
    public static void main(String[] args){

       int studentNumber = 25;

       studentNumber = studentNumber +1;
       studentNumber+=1;

       studentNumber++;
        System.out.println(studentNumber);

        ++studentNumber;
        System.out.println(studentNumber);

        studentNumber--;
        System.out.println(studentNumber);
        --studentNumber;
        System.out.println(studentNumber);
        studentNumber--; studentNumber--; studentNumber--;//24


        //=============================================

        studentNumber++;
        studentNumber--;
        System.out.println(studentNumber++);//25---> it show 24 bc in the system out but invreases afterword, studentNumber is now 25

        System.out.println(studentNumber); // shows 24
        System.out.println(++studentNumber);// it shows 26, increases first and then print out
        System.out.println(studentNumber--);//--> 26 show first then decrease by 1, 25
        studentNumber--;// 24
        --studentNumber;// 23
        System.out.println(--studentNumber);// decrease 22 then show 22
        System.out.println(studentNumber); // print 22



        int a = studentNumber++ + studentNumber++ +5;
        a--;
        a= studentNumber;
        System.out.println(a--);//24
        System.out.println(a--);// 23
        System.out.println(a); // 22



    }
}
