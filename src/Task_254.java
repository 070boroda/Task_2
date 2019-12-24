import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_254 {

    public static void main(String[] args) {

        int N = 5000;
        int quantity = 0;
        int quantityChange = 0;
        int startArray[] = new int[N];
        int modifiedArray[] = new int[N];
        StringBuilder result = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new FileReader("input.txt"))) {
            Scanner scanner = new Scanner(in);
            quantity = scanner.nextInt();
            for (int i = 0; i < quantity; i++) {
                startArray[i] = scanner.nextInt();
            }
            modifiedArray = startArray.clone();

            quantityChange = scanner.nextInt();
            for (int i = 0; i < quantityChange; i++) {
                int first = scanner.nextInt();
                int change = scanner.nextInt();
                for (int j = 0; j < quantity; j++) {
                    if (startArray[j] == first) {
                        modifiedArray[j] = change;

                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < quantity; i++) {
            result.append(modifiedArray[i] + " ");
        }
        try (FileWriter output = new FileWriter("output.txt")) {
            output.write(result.toString());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
