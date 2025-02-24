package _05_Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước chiều thứ nhất: ");
        int x = scanner.nextInt();
        System.out.print("Nhập kích thước chiều thứ hai: ");
        int y = scanner.nextInt();
        System.out.print("Nhập kích thước chiều thứ ba: ");
        int z = scanner.nextInt();

        int[][][] arr = new int[x][y][z];

        System.out.println("Nhập giá trị cho mảng 3D:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.printf("Nhập giá trị tại arr[%d][%d][%d]: ", i, j, k);
                    arr[i][j][k] = scanner.nextInt();
                }
            }
        }

        // Ghi mảng vào file
        File outputFile = new File("src/_05_Arrays/data/outputB4.txt");
        writeArrayToFile(arr, outputFile);

    }

    public static void writeArrayToFile(int[][][] arr, File outputfile) {
        try (PrintWriter writer = new PrintWriter(outputfile)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    for (int k = 0; k < arr[i][j].length; k++) {
                        writer.print(String.format("arr[%d][%d][%d] = %d\n", i, j, k, arr[i][j][k]));
                    }
                }
            }
            System.out.println("Đã ghi mảng vào file: " + outputfile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }

    }
}
