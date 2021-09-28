package HomeWork;

public class HomeWork2T5 {
    public static void main(String[] args){

 float salaryInYear = 200000;
        float salaryInMonthly = salaryInYear/12;
        float percentOfSalary1 = salaryInMonthly%50;
        float percentOfSalary2= salaryInMonthly%30;
        float percentOfSalary3 = salaryInMonthly%20;

        float bonus1 = (percentOfSalary1)%5;
        float bonus2 = (percentOfSalary2)%8;
        float bonus3 = (percentOfSalary3)%10;

        System.out.println(bonus1);
        System.out.println(bonus2);
        System.out.println(bonus3);





    }
}
