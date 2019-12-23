import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        double value = 0;

        try (BufferedReader in = new BufferedReader(new FileReader("input.txt"))) {
            Scanner scan = new Scanner(in);
            value = scan.nextDouble();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        value = (1 + value) / 2 * (Math.abs(value > 0 ? value : value - 2));

        try (FileWriter output = new FileWriter("output.txt")) {
            output.write(Integer.toString((int) Math.round(value)));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
