package HomeWork;

public class HomeWork2T2 {

    public static void main(String[] args){

        int result = 4*7+3-2*9%5/3-2;
        int result2=(4*7)+3-((2*9)%5)/(3-2);
        System.out.println(result2);
        System.out.println(result);
        int step1 = 4*7;
        int step2 = step1+3;
        int step3 = 2*9;
        int step4 = step3%5;
        int step5 = 3-2;
        int step6 = step4/step5;
        int lastStep = step2-step6;//28
        System.out.println(lastStep);



        int result1 = 12-3/3+4-2*2%4+12%3/3;
        int result3 = (12-(3/3)+4)-((2*2)%4)+(12%(3/3));
        System.out.println(result3);
        System.out.println(result1);

        int st1 = 2*2;
        int st2 = st1%4;
        int st3 = 3/3;
        int st4 = 12-st3;
        int st5 = st4+4;
        int st6 = 3/3;
        int st7 = 12%st6;
        int st8 = st5-st2;
        int st9 = st8 +st7;
        int sum = st9;

        System.out.println(sum);

    }

}
