package Methods;

public class BodyIndex {
    //lets do kg and meter
    public double bmi(int kg, double meter) {

        // we need to divide kg to square of meter
        double squareMeter = meter * meter;
        return kg / squareMeter;
    }
        // we are asked to calculate body index for US
        public double bmi(int pound,int feet,int inch){
        double kilogramm = pound*0.45;
        double meter = feet*0.3 +inch*0.025;
        double squareMeter = meter*meter;
        return kilogramm/squareMeter;


    }

    public static void main(String[] args) {
        BodyIndex bodyIndex = new BodyIndex();
        // bodyIndex.bmi(79,1.8);
        System.out.println(bodyIndex.bmi(174,5,10 ));

    }

}
