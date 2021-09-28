package Methods;

public class Cup {
    double size;
    boolean isClean;
    double liqidAmound;

    public Cup(int inputSize, boolean inputClean, double inputLiquitAmount){

        this.size  = inputSize;
        this.isClean = inputClean;
        this.liqidAmound = inputLiquitAmount;
    }
    public Cup (){

    }

    public void info(){
        System.out.println("size"+size+"is clean "+isClean+" liquid amound is "+liqidAmound);

    }
    public String toString(){
       // return "*****************";
//        return "\"Size: \+size\"isClean:\"+isCleane\"n+liquid Amound:\"+
//                return "Size "+ size+"is Cleane"+isClean+"liquidAmound "+liqidAmound;
        return "size"+size+"is clean "+isClean+" liquid amound is "+liqidAmound;



    }
}

