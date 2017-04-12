import java.util.Scanner;

/**
 * Created by jthomas on 4/9/17.
 * Alternate Method
 * Rotate by +90--> take transpose and reverse each row
 * Rotate by -90 --> take transpose and reverse each column
 * Rotate by 180 --> reverse each column and reverse each row or rotate by 90 twice
 */
public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrix[][] = new int [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int n = 4;
        rotateMatrix(matrix, n);
    }

    private static void rotateMatrix(int[][] matrix, int n) {
        int temp;
        for (int i = 0; i < n/2; i++) {

            for (int j = 0; j < n; j++) {

                temp = matrix[i][j];


            }
        }
    }
}
