package MentoringAhmed;

public class ArrayPractice1 {
    public static void main(String[] args) {
        // int [] array = { 5,8,23,18,53,7,6,93,63,51,43,78,4, 93}
        // find the sum of even and obb number from array and get the difference between them

        int [] array = { 5,8,23,18,53,7,6,93,63,51,43,78,4, 93};
        for (int number:array){
            int sumOfEven =0;
            int sumOfObb = 0;

            if (number%2==0){

               // System.out.println("this is even number");
                sumOfEven+=number;

            }else{
                sumOfObb+=number;
                System.out.println(sumOfObb-sumOfEven);
            }
        }
    }
}
