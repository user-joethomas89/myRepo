import java.util.Scanner;

/**
 * Created by jthomas on 4/7/17.
 */
public class UniqueCharactersInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        isUnique(string);
    }

    private static void isUnique(String string) {

        int val = 0;
        int checker = 0;
        for (int i = 0; i < string.length(); i++) {
            val = string.charAt(i) - 'a';
            if((checker & (1 << val)) > 0){
                System.out.println("Not Unique!!");
                return;
            }
            checker = checker | (1 << val);
        }
        System.out.printf("Unique!!");
    }
}
