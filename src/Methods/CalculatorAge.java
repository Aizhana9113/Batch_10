package Methods;

public class CalculatorAge {
    //create a methods that will take one int parameter for your birth year
    // this method simply calculates and prints you age



    public void ageCalculator(int birthYear){
        int age = 2021-birthYear;
        System.out.println("your age is "+age);



    }
public int ageCalculator(){

        int age =2021 -2015;
    System.out.println("Your age is "+age );
    return age;
}


// overload this very method by passing a string parameters
    //witch name is go in to be  of the person
    //and print out the age of the person as:
    //"........ your age is ......"

    public String  ageCalculator (int birthYear, String name){
        int age =2021 -birthYear;
        //System.out.println(name + "Your age is "+age );
        return " "+name+" your age "+age;
    }



//    public static void main(String[] args) {
//        CalculatorAge jerry =new CalculatorAge();
//        jerry.ageCalculator(1990);
    }

