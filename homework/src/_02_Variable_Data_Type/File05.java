package _02_Variable_Data_Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File05 {
    public static void main(String[] args) {
        File inputFile = new File("src/_02_Variable_Data_Type/data/input05.txt");
        File outputFile = new File("src/_02_Variable_Data_Type/data/output05.txt");

        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter writer = new PrintWriter(outputFile)) {

            String fullname = scanner.nextLine();
            int age = scanner.nextInt();
            scanner.nextLine();
            String high = scanner.nextLine();

            writer.printf(
                    "\u2022 Họ và tên: %s\n" +
                    "\u2022 Tuổi: %d\n" +
                    "\u2022 Chiều cao: %sm\n",
                    fullname, age, high
            );

        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại: " + inputFile.getAbsolutePath());
        }

    }
}
