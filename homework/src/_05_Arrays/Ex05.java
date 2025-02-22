package _05_Arrays;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws IOException {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        Scanner sc = new Scanner(new File(inputFile));
        int sum = 0;

        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        sc.close();

        FileWriter writer = new FileWriter(outputFile);
        writer.write("Tổng các số trong file: " + sum);
        writer.close();

        System.out.println("Kết quả đã được ghi vào " + outputFile);
    }
}
