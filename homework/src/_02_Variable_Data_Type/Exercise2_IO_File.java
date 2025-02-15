package _02_Variable_Data_Type;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise2_IO_File {
    public static void main(String[] args) throws Exception {
        File inputFile = new File("...\\homework\\data\\input.txt");  // path file .txt bạn tạo
        File outputFile = new File("...\\homework\\data\\output.txt");

        if (!inputFile.exists()) {
            System.out.println("Error: Input file does not exist!");
            return;
        }

        Scanner scanner = new Scanner(inputFile);
        double value = scanner.nextDouble();
        String unit = scanner.next();
        scanner.close();

        PrintWriter writer = new PrintWriter(outputFile);
        if (unit.equalsIgnoreCase("F")) {
            writer.printf("%.2f F = %.2f C%n", value, (value - 32) * 5 / 9);
        } else if (unit.equalsIgnoreCase("C")) {
            writer.printf("%.2f C = %.2f F%n", value, (value * 9 / 5) + 32);
        } else {
            writer.printf("Error: Invalid unit (%s)%n", unit);
        }
        writer.close();

        System.out.println("Success! Check the output file.");
    }
}
