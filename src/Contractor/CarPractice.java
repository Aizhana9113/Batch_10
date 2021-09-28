package Contractor;

public class CarPractice {


    /*
    create a class witch instance field of brand of the car
    - create one move method to simply print out "car is moving"
    - crate a constructor to initialize instance variables
    - create a test  class to test this car class
    - send  some of the object to garbage
    -  call garbage collector
    - make sure gc() is working
     */

    String brand;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public CarPractice(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "the brand of the car is "+brand;
    }

    public void move () {
        System.out.println("Car is moving ");
    }

    }









