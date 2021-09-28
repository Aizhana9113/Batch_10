package Contractor;

public class Computer {
    /*
    Create a computer class
       - have instance field of price of the computer
        -crate  a calculate method to find the total price of 4 computers
          - this method will be take an array as parameter witch represents prices of those 4 computers
           -this is will be return the total price

                -create two constructor
               - one witch one no agr
                -one witch agrs to init instance variable

                override the toString to show price of the computer

 */

    double price;

    public Computer() {
        System.out.println("This is No argument Constructor");
    }

    public Computer(double price) {
        this.price = price;
        System.out.println("This is One argument constructor");
    }


    public static double calculate(double[] pricesOfComputers){
        double totalPrice =0;
        for (double price : pricesOfComputers){
            totalPrice+=price;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return ""+price;
    }

    public static void main(String[] args) {
        double[] array = {1.2,  2.3,  4.5,  8.6};

        double total = calculate(array);
        System.out.println(total);
        Computer c1 = new Computer();
        System.out.println(c1);
    }
}







