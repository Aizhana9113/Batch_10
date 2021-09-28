package Methods;

public class Math {


    public void sum(int a, int b){

    //int a = 4;
    //int b = 3;
     String name = "we are " ;
     String name2 = "learn java";
     String fullWord= name+name2;

    int sum = a + b;
        System.out.println("the sum of "+a+"and "+b+"is "+sum);



}

    public int  sum1( int a, int b,int c ){

        int sum =a+b+c;
        System.out.println("The sum of "+a+ "and "+b+" is "+sum);
        return sum;


    }

// create the that will take String parameters for
    // name the operation and two other parameters as int data type
    //this methods will print result according to the provided operation

    public void operation(String operation, int a, int b ){


        switch (operation){

            case "add":
                System.out.println("the sum is "+(a+b));
                break;
            case "subtract":
                System.out.println("the sum is "+(a-b));
                break;

            case "multiply":
                System.out.println("the sum is "+(a*b));
                break;

            case "divide":
                System.out.println("the sum is "+(a/b));
                break;
            case "remainder":
                System.out.println("the sum is "+(a%b));
                break;
            default:
            System.out.println(" operation name should be : add/subtract/ multiply/ divide/remainder ");



        }

    }


}
