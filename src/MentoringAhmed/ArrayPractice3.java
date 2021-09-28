package MentoringAhmed;

public class ArrayPractice3 {
    public static void main(String[] args) {
        int[] number = {4, 5, 6, 7, 8, 9,};
        String inique = "";
        for (int i = 0; i < number.length; i++) {

            boolean isUnique = true;
            for (int k = 0; k < i; k++) {
                if (number[i] == number[k]) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                inique += number[i] + " ";
            }
            System.out.println(inique);

        }
    }
}