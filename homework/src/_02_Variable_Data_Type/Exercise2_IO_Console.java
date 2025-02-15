package _02_Variable_Data_Type;

import java.util.Scanner;

public class Exercise2_IO_Console {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Khởi tạo Scanner để nhập dữ liệu từ bàn phím

        // Nhập giá trị nhiệt độ
        System.out.print("Nhap gia tri nhiet do: ");
        double value = scanner.nextDouble();

        // Nhập đơn vị nhiệt độ (F hoặc C)
        System.out.print("Nhap don vi (F hoac C): ");
        String unit = scanner.next();

        // Check nếu đơn vị là F
        if (unit.equalsIgnoreCase("F")) {
            double celsius = (value - 32) * 5 / 9; // Công thức chuyển đổi từ F -> C
            System.out.printf("%.2f F = %.2f C%n", value, celsius);
        }
        // Check nếu đơn vị là C (Celsius)
        else if (unit.equalsIgnoreCase("C")) {
            double fahrenheit = (value * 9 / 5) + 32; // Công thức chuyển đổi từ C -> F
            System.out.printf("%.2f C = %.2f F%n", value, fahrenheit);
        }
        else {
            System.out.println("Lỗi: Đơn vị không hợp lệ!");  // Check nhập sai đơn vị thì báo lỗi
        }

        scanner.close();
    }
}

/*
Nhap gia tri nhiet do: 45
Nhap don vi (F hoac C): c
45.00 C = 113.00 F
*/
