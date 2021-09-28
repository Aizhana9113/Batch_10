package Primitives;

public class LogicalOperator {
    public static void main(String[] arg){

        // ==, !=, >, >=, <= ---> any comporison to

        int myAge = 20;
        boolean myDress  = true;


        int ageReg = 21;
        boolean dressCode = true;


        boolean can_I_Attand = myAge >= ageReg && myDress == dressCode;

        System.out.println(can_I_Attand);


        myAge =21;
        boolean can_I_Attand1 = myAge >= ageReg && myDress == dressCode;
        System.out.println(can_I_Attand1);


        int myNewAge = 28;
        boolean myMoney= false;
        int ageRequirment = 18; // just 18 not pay
        boolean moneyReq = true;


        boolean canIGo = myNewAge >= ageRequirment || myMoney == moneyReq;
        System.out.println(canIGo);

        myNewAge = 8;


        canIGo = myNewAge >= ageRequirment || myMoney == moneyReq;
        myMoney = true;
        canIGo = myNewAge >= ageRequirment || myMoney == moneyReq;
        System.out.println(canIGo);










    }
}
