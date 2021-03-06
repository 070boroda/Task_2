import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_550 {

    public static void main(String[] args) {

        String dateLeapYear;
        String dateYear;
        int year = 0;
        try (BufferedReader in = new BufferedReader(new FileReader("input.txt"))) {
            Scanner scan = new Scanner(in);
            year = scan.nextInt();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            dateLeapYear = "12/09/";
        } else {
            dateLeapYear = "13/09/";
        }

        dateYear = String.format("%04d", year);
        try (FileWriter output = new FileWriter("output.txt")) {
            output.write(dateLeapYear + dateYear);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
