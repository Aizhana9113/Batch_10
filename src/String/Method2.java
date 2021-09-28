package String;

public class Method2 {
    public static void main(String[] args){

        String name = "Diana";
        // indexOf will count from zero and will show number word.

        name.indexOf('D');// it will show
        System.out.println(name.indexOf('D'));

        name.indexOf("D");
        System.out.println(name.indexOf("D"));



        name.indexOf("Di");
        System.out.println(name.indexOf("Di"));// it will show also 0 bc index will return on the first letter sou



        name.indexOf("ana");// --->2

        System.out.println(name.indexOf("ana"));// it will show 2 bc location a is 2 from word

        System.out.println( name.indexOf("tina"));// it will show -1 it meaning is error bc we have not matching with my command

        System.out.println(" it is saturday morning "); //it will work after


        name.concat("Bejan");// here error bc we are not change name
        System.out.println(name.concat("Bejan"));

        System.out.println(name);// Diana Bejan

        name.indexOf("a", 2);// --->

        System.out.println(name.indexOf("a", 2)); //it will looking for that char
                                                               // starting from given index

        name.indexOf("B",name.indexOf(" "));// here will start looking after space middle in Diana Bejan.

        name= "Arzu Beril Sen";
        System.out.println(name.indexOf("e",7));// it shoud be looking for count after second space

        System.out.println((name.indexOf("e",7)+name.indexOf(" ")+3));

       // name.indexOf(); // value that you can giving inside of the method parenthses are called parametrs
                       // some methods  take no parameters , some can take single or multiple paraneters

        name.length(); // no parameters
        name.charAt(3); // single parameters
        name.indexOf("e",4); // You can pass eigher one or two parameters by separating them with command

    }
}
