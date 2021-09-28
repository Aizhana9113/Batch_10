package Primitives;

public class LogicalOperator2 {
    public static void main(String[] args){
     // there is event for kids they must be older than 5, 12 younger than 12
      // the other req is there height needs to be lees than 46"
        // to be able to attend


        int myKidAge = 6;
        int myKidHeight =47;


        int  minAge = 5;
        int maxAge = 12;
        int  kidHeightReq = 46;
        boolean can_I_Attend ;

         boolean ok = (myKidAge>=minAge && myKidAge <=maxAge) && myKidHeight>= kidHeightReq;


        System.out.println(ok);







    }

}
