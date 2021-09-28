package Loops;

public class hoursMinutes {
    public static void main(String[] args) {
        for (int a =0; a< 2; a++){ // it will work for add pm, am

            if(a==0){
                continue;//
            }
 OUTER:
        for (int hour =0; hour<12; hour++){
            if(hour==10 || hour==11){
                break OUTER;
            }
           if(hour>=5 && hour<=7){// also I can (hour>4 && hour<8) and we can don't give {} for
                continue;
            }
            for (int minutes =0;minutes <=60; minutes++){
                if (a==0) { // we will give if we wont add somethink like am , pm.
                    System.out.println(hour + ";" + minutes + "am");

                }
                else{

                    System.out.println(hour+";"+minutes+"pm");
                }

                }
            }
        }
    }
}
