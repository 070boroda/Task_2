import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
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
        int array[][] = new int[N][N];
        StringBuilder result = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new FileReader("input.txt"))) {
            Scanner scanner = new Scanner(in);
            t = scanner.nextInt();
            for (int i = 0; i < t; i++) {
                n = scanner.nextInt();
                m = scanner.nextInt();
                for (int k = 0; k < n; k++) {
                    for (int j = 0; j < m; j++) {
                        array[k][j] = scanner.nextInt();
                    }
                }
                result.append(isPretty(array, n, m) ? "YES\n" : "NO\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter output = new FileWriter("output.txt")) {
            output.write(result.toString());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
