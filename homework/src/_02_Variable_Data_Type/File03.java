package _02_Variable_Data_Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File03 {
    public static void main(String[] args) {
        File inputFile = new File("src/_02_Variable_Data_Type/data/input03.txt");
        File outputFile = new File("src/_02_Variable_Data_Type/data/output03.txt");

        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter writer = new PrintWriter(outputFile)) {

            int m = scanner.nextInt();

            // Chuyển đổi sang dạng giờ và phút
            int hours = m/60;
            int minutes = m - hours*60;

            // Chuyển đổi số ngày và giờ còn lại
            int days = hours/24;
            hours = hours - days*24; // Tính số giờ còn lại (Nếu hours > 24)

            // Chuyển đổi số năm và ngày còn lại
            int years = days/365;
            days = days - years*365; // Tính số ngày còn lại (Nếu days > 365)

            writer.println("Kết quả: " + years + " năm, " + days + " ngày, "
                    + hours + " giờ, " + minutes + " phút." );

        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại: " + inputFile.getAbsolutePath());
        }


    }
}
