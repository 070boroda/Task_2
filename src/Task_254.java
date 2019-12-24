import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task_254 {

    public static void main(String[] args) {

        int N = 5000;
        int m =0;
        int n;
        int array[] = new int[N];
        int array2[] = new int[N];
        StringBuilder result = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new FileReader("input.txt"))) {
            Scanner scanner = new Scanner(in);
            m = scanner.nextInt();
            for (int i = 0; i < m; i++) {
                array[i] = scanner.nextInt();
            }
            array2 = array.clone();

            n = scanner.nextInt();
            for (int i = 0;i<n;i++) {
                int first = scanner.nextInt();
                int change = scanner.nextInt();
                for (int j = 0; j < m; j++) {
                    if (array[j] == first) {
                        array2[j] = change;

                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

            for(int i = 0; i < m;i++){
            result.append(array2[i] + " ");
            }
        try (FileWriter output = new FileWriter("output.txt")) {
            output.write(result.toString());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

