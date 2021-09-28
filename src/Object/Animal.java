package Object;

public class Animal {
    String name;
    int age;
    double weight;
    int legNumber;
    double energy =100;// it will change


    public void  run(String destination) {

        energy-=10;
        System.out.println("Animal is running"+destination);
        System.out.println(name + "is running ");
        // craete a sleep method and print >>> ".. is sleep"
        // make a every animal sleep
    }

        public void sleep(){
        energy =100;// it will change bc we are resingning
            System.out.println(name + " is sleep");
            System.out.println(name + " is sleep");
            System.out.println(name+ "is sleep ");

        }
        // create printInfo () method to print uot all information
    // about animal.


    public  void printInfo(){
        System.out.println("name is "+name+" age is ;"+age+" weight is :"+weight+" legNumber is: "+legNumber+" energy is "+energy);



    }
}