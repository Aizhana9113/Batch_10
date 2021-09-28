package Array;

public class Task4 {
    public static void main(String[] args) {
        /* NESTED METHOD
        print out the number pair that their sum is 30
        {14,21, 6,74,25,9,84,16}
        hint: nested for loop
       ex: 14 and 16 makes 30
         21 and 9 makes 30
         */

        int[] numbers = {14, 21, 6,5, 74, 25,25,26,45, 9, 16, 15,15};

        for (int i = 0; i < numbers.length ; i++) {
            for (int k = 0; k < numbers.length; k++) {
                if (numbers[i] + numbers[k] == 30) {
                    System.out.println(numbers[i] + "+" + numbers[k]+" = 30");
                }
            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

            for (int a = 0; a< numbers.length; a++){
                for (int b =0; b< numbers.length; b++){
                    if(numbers[a] +numbers[b]==50){
                        System.out.println(numbers[a]+ "+" +numbers[b]+ "= 50");
                    }
                }

                }
            }
        }
    }
