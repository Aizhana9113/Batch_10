package Object;

public class AnimalTest {
    public static void main(String[] args) {

        Animal cat= new Animal();
        System.out.println(cat.name);
        cat.name ="Tom";
        System.out.println(cat.name);

        cat.age = 5;
        cat.weight= 8.5;
        cat.legNumber = 4;

        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.weight);

        // create a dog object and initialize each variable and print them out


        Animal dog= new Animal();
        dog.name ="Rouse";
        System.out.println(dog.name);

        dog.age = 6;
        dog.weight= 10.5;
        dog.legNumber = 4;




        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.weight);

        Animal bird = new Animal();
        System.out.println(bird.weight);
        cat.run("south");
        dog.run("west");


        cat.sleep();
        dog.sleep();
        bird.sleep();


        System.out.println("=++++++++++++++++++++++");
        cat.printInfo();
        cat.energy =100;
        cat.printInfo();
        cat.run("up");
        cat.printInfo();
        cat.run("down");
        cat.run("left ");
        cat.printInfo();
        cat.sleep();
        cat.printInfo();
        //++++++++++++++++++++++++++

        bird.energy = 100;
        bird.sleep();
        bird.run("into air");

        //System.out.println(cat.sleep());

        // System.out.println(cat.name);
    }
}
