import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_195 {

    public static void main(String[] args) {

        int n = 0;
        int a = 0;
        int b = 0;
        int result;
        try (BufferedReader in = new BufferedReader(new FileReader("input.txt"))) {
            Scanner scan = new Scanner(in);
            n = scan.nextInt();
            a = scan.nextInt();
            b = scan.nextInt();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        result = n * a * b * 2;

        try (FileWriter output = new FileWriter("output.txt")) {
            output.write(Integer.toString(result));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
