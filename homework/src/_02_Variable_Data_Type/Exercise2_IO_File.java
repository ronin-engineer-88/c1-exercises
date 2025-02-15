package _02_Variable_Data_Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise2_IO_File {
    public static void main(String[] args) {
        File inputFile = new File("..../data/input.txt");  // File chứa dữ liệu đầu vào
        File outputFile = new File("..../data/output.txt"); // File ghi kết quả

        try (Scanner scanner = new Scanner(inputFile); // Đọc từ file
            PrintWriter writer = new PrintWriter(outputFile)) { // Ghi vào file

            while (scanner.hasNext()) { // Đọc từng dòng
                double value = scanner.nextDouble(); // Đọc số nhiệt độ
                String unit = scanner.next(); // Đọc đơn vị nhiệt độ (F hoặc C)

                if (unit.equalsIgnoreCase("F")) {
                    double celsius = (value - 32) * 5 / 9; // convert từ F -> C
                    writer.printf("%.2f F = %.2f C%n", value, celsius); // Ghi kết quả vào file
                } else if (unit.equalsIgnoreCase("C")) {
                    double fahrenheit = (value * 9 / 5) + 32; // convert C -> F
                    writer.printf("%.2f C = %.2f F%n", value, fahrenheit); // Ghi kết quả vào file
                } else {
                    writer.printf("Error: Don vi khong hop le (%s)%n", unit); // Check sai đơn vị, ghi lỗi vào file
                }
            }

            System.out.println("Success, kiem tra file output.txt!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Khong tim thay file dau vao.");
        }
    }
}
