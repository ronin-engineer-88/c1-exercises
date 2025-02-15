package _02_Variable_Data_Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise4_IO_File {
    public static void main(String[] args) {
        File file = new File(".../data/inputDate.txt");

        if (!file.exists()) {
            System.out.println("Error: File does not exist!");
            return;
        }

        try (Scanner scanner = new Scanner(file)) { // Dùng try-with-resources
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();

            System.out.printf("Dinh dang dd/MM/yyyy: %02d/%02d/%d\n", day, month, year);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }
}
