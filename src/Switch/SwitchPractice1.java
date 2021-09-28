package Switch;

public class SwitchPractice1 {
    public static void main(String[] args) {


        int number = 30;
        switch(number){
            case 3:
                System.out.println("first");
                break; // wil stop you exeqution value
            case 25:
                System.out.println("Second");
                break;
            case 5:
                System.out.println("Third"); //if we are not put it will show every value
                break;
            case 11:
                System.out.println("Fourth");
                break;// here if will not break it will show
            default:
                System.out.println("This is default ");



        }

    }
}
