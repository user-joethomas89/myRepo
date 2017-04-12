import java.util.Scanner;

/**
 * Created by jthomas on 4/8/17.
 */
public class oneAway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        if (Math.abs(string1.length() - string2.length()) > 1) {
            System.out.println("False");
        } else {
            checkOneAway(string1, string2);
        }
    }

    private static void checkOneAway(String string1, String string2) {
        int count = 0;
        int val = 0;
        int array[] = new int[26];
        for (int i = 0; i < string1.length(); i++) {
            val = string1.charAt(i) - 'a';
            array[val]++;
        }
        for (int i = 0; i < string2.length(); i++) {
            val = string2.charAt(i) - 'a';
            array[val]--;
        }

        for (int i : array
                ) {
            if (i != 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println("Not One Away!!");
        } else {
            System.out.println("One Away!!");
        }
    }
}
