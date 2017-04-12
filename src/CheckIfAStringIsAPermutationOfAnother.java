import java.util.Scanner;

/**
 * Created by jthomas on 4/7/17.
 */
public class CheckIfAStringIsAPermutationOfAnother {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        if (string1.length() != string2.length()) {
            System.out.println("Not Permutations!!");
        } else {
            checkPermutation(string1, string2);
        }
    }

    private static void checkPermutation(String string1, String string2) {
        int val = 0;
        int checker = 0;
        for (int i = 0; i < string1.length(); i++) {
            val = string1.charAt(i) - 'a';
            checker = checker | (1 << val);
        }
        val = 0;
        for (int i = 0; i < string2.length(); i++) {
            val = string2.charAt(i) - 'a';
            if((checker & (1 << val)) < 1){
                System.out.println("Not permutations");
                return;
            }
        }
        System.out.println("Permutations!!");
    }
}
