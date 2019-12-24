import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_58 {

    public static boolean isPretty(int arr[][], int row, int column) {
        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < column - 1; j++) {
                if (arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1] % 4 == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int N = 100;
        int quantity, row, column;
        int array[][] = new int[N][N];
        StringBuilder result = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new FileReader("input.txt"))) {
            Scanner scanner = new Scanner(in);
            quantity = scanner.nextInt();
            for (int i = 0; i < quantity; i++) {
                row = scanner.nextInt();
                column = scanner.nextInt();
                for (int k = 0; k < row; k++) {
                    for (int j = 0; j < column; j++) {
                        array[k][j] = scanner.nextInt();
                    }
                }
                result.append(isPretty(array, row, column) ? "YES\n" : "NO\n");
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
