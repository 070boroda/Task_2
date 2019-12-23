import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task_58 {

    public static boolean isPretty(int arr[][], int n, int m) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                if (arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1] % 4 == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int N = 100;
        int t, n, m;
        int array[][] = new int[4][4];

        try (BufferedReader in = new BufferedReader(new FileReader("input.txt"))) {
            Scanner scanner = new Scanner(in);
            n = scanner.nextInt();
            m = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
