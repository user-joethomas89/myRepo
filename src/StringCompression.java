import java.util.Scanner;

/**
 * Created by jthomas on 4/9/17.
 */
public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        compressString(string);
    }

    private static void compressString(String string) {
        int count = 1;
        for (int i = 0; i < string.length() - 1; i++) {

            if (string.charAt(i) == string.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(string.charAt(i));
                if (count != 1) {
                    System.out.print(count);
                }
                count = 1;
            }
        }
        if (count >= 1) {
            System.out.print(string.charAt(string.length() - 1));
            if (count != 1) {
                System.out.print(count);
            }
        }

    }

}
