package _02_Variable_Data_Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise4_IO_File {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("02_Variable_Data_Type/data/input04.txt");

        if (!file.exists()) {
            System.out.println("Error: File does not exist!");
            return;
        }

        Scanner scanner = new Scanner(file);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();

        System.out.printf("(dd/MM/yyyy): %02d/%02d/%d%n", day, month, year);
    }
}
