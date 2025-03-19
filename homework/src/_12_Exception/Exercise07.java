package _12_Exception;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Exercise07 {
    public static void main(String[] args) {
        String fileName = "....../output.txt";

        try (FileWriter fileWriter = new FileWriter(fileName);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            printWriter.println("Hello word");
            printWriter.println("Using try-with-resources very good.");
            System.out.println("Đã ghi nội dung vào file " + fileName + " thành công!");
        } catch (Exception e) {
            System.out.println("Lỗi: Không thể ghi file! " + e.getMessage());
        }
    }
}
