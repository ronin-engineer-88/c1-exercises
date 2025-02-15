package _02_Variable_Data_Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise4_IO_File {
    public static void main(String[] args) {
        try {
            File file = new File(".../data/inputDate.txt"); // Open file
            Scanner scanner = new Scanner(file);

            // Đọc dữ liệu từ file
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();

            // In ra theo dinh dang dd/MM/yyyy
            System.out.printf("Dinh dang dd/MM/yyyy: %02d/%02d/%d\n", day, month, year);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
            e.printStackTrace();
        }
    }
}
