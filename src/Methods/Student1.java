package Methods;

import java.util.Random;

public class Student1 {
    int age;
    String firstName;
    String lastName;

    public void sleep(String place ){// static method
       int hour = generateHour();// non static method
        System.out.println(firstName+"is sleep "+place +hour +" hour");
        study();

    }

    public static void study (){
        System.out.println(" is studying hour");

    }
    public void run (){
        System.out.println(firstName+"is running"+generateHour()+"hour ");

    }

    public static void main(String[] args) {

        Student1 student2 = new Student1();
        student2.firstName = "Jonn";
        student2.lastName = "Sina;";
        student2.age = 36;
        student2.study();
        student2.sleep("in class");
        student2.run();
        study();
        Student1.study();// it will work here bc of non static
    }
        // create the generalHour to get the random amount of hour and pass that hour to  each of methods (sleep, study,run)

        public int generateHour(){
            Random random =new Random();
           int hour =  random.nextInt(8);

           return hour;// we get random number

        }



    }

