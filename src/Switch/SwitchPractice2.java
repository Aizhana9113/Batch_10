package Switch;

public class SwitchPractice2 {
    public static void main(String[] args) {
        String name = "Luna".toUpperCase();// it meaning is lets go with Uppercase

        switch(name){
            default:
                System.out.println("Students is not here");
                break;// meaning is don't take more case, stop here
            case "Alex":
                System.out.println("Alex is here");
                break;
            case "David":
                 System.out.println("david is here");
                 break;
            case "Luna":
                System.out.println("Luna is here");
                break;


        }
    }
}
