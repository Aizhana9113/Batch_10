package Loops;

public class ContinueBreakStatements {
    public static void main(String[] args) {
        OUTER:
        for (int number=0; number<5;number++) {
            if (number ==4){
                break;

        }
            if (number>=1 && number<=3){
                continue ;// mean is skipt
            }
            for(char ch ='A';ch< 'H'; ch++){
                if (number==4){
                    break OUTER;// mean is STOP other is only for labeling purpose and break
                }               // statement will stop execution for curtain condition.
                if (ch=='C'|| ch=='D'){// here || mean is C and D different letter. we can't use && bc it mean is if letters is together
                    continue ;// 'continue' will skip
                }
                System.out.println(number+""+ch);
                //System.out.println(ch);
            }
        }
    }

}
