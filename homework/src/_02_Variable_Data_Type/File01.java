package _02_Variable_Data_Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File01 {
    public static void main(String[] args) {
        File inputFile = new File("src/_02_Variable_Data_Type/data/input01.txt");
        File outputFile = new File("src/_02_Variable_Data_Type/data/output01.txt");

        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter writer = new PrintWriter(outputFile)) {

             double inches = scanner.nextDouble();
             double centimeters = inches * 2.54; // convert inch -> cm (1 inch = 2.54cm)
             writer.println(inches + " inch = " + centimeters + " cm");

        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại: " + inputFile.getAbsolutePath());
        }
    }
}
