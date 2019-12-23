import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try (BufferedReader in = new BufferedReader(new FileReader("input.txt"))) {
            Scanner scan = new Scanner(in);
            a = scan.nextInt();
            b = scan.nextInt();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        try(FileWriter output = new FileWriter("output.txt")){
            output.write(Integer.toString(a+b));
        } catch (IOException|NumberFormatException e){
            e.printStackTrace();
        }
    }
}
