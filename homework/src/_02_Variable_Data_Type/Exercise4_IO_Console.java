package _02_Variable_Data_Type;

import java.util.Scanner;

public class Exercise4_IO_Console {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập ngày, tháng, năm
        System.out.print("Nhap ngay: ");
        int day = scanner.nextInt();
        System.out.print("Nhap thang: ");
        int month = scanner.nextInt();
        System.out.print("Nhap nam: ");
        int year = scanner.nextInt();

        // dinh dang và show ket qua
        System.out.printf("Dinh dang dd/MM/yyyy: %02d/%02d/%d\n", day, month, year);

        scanner.close();
    }
}
