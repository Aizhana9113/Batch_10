package Primitives;

import java.time.OffsetDateTime;

public class LogicalOperatorPractice {

    public static void main(String[] args){


        /*
         oyu need to pass
         if you attend 95 percent or more  of the classes
         or
         you get than 70 as passing score out of 100
         */

        int attendReq= 95;
        int scoreReq = 70;
        int myAttend = 10;
        int myScore = 65;

        boolean pass = myAttend>= attendReq || myScore>scoreReq;// false bc my score less than 70 and less than 90%
        System.out.println("Am I passing "+pass);
        System.out.println(!pass);
        System.out.println(!(myAttend>= attendReq || myScore>scoreReq));




    }
}
