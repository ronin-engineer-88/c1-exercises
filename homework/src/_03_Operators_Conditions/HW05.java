package _03_Operators_Conditions;

import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        // Khai báo Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng
        System.out.print("Nhập chiều dài (a): ");
        double a = scanner.nextDouble();

        System.out.print("Nhập chiều rộng (b): ");
        double b = scanner.nextDouble();

        // Tính chu vi và diện tích
        double chuVi = 2 * (a + b);
        double dienTich = a * b;

        // Hiển thị kết quả
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);

        // Đóng Scanner
        scanner.close();
    }
}
