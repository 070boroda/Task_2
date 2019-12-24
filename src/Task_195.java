import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_195 {

    public static void main(String[] args) {

        int quantity = 0;
        int width = 0;
        int height = 0;
        int result;
        try (BufferedReader in = new BufferedReader(new FileReader("input.txt"))) {
            Scanner scan = new Scanner(in);
            quantity = scan.nextInt();
            width = scan.nextInt();
            height = scan.nextInt();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        result = quantity * width * height * 2;

        try (FileWriter output = new FileWriter("output.txt")) {
            output.write(Integer.toString(result));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
