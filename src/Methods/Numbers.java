package Methods;

public class Numbers {
    // let swrite a method to find of sum of two integer numbers
    public int findSum(int a, int b){
        return a+b;
    }
    // lets write sativc methods to find division of two number
    public static int findDivision(int a,int b){
        return a/b;
    }
    // in the same class differencess for static and non static
    public static void main(String[] args) {
        // main method is static method so I should only be able to




        Numbers numbers = new Numbers();
        numbers.findSum(4,5);
        //Can I call  findDivision with numbers object
        // if we are calling the satic methods in same classs
        // we are cant call using object but we can call when we are outside
        // of the class

        // Since findDivision ias a static method and I am in same class I can
        // call by using  name
        findDivision(20, 3);
        Numbers.findDivision(30,4);






    }
}
