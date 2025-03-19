package _12_Exception;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số thứ nhất: ");
            int soThuNhat = scanner.nextInt();

            System.out.print("Nhập số thứ hai: ");
            int soThuHai = scanner.nextInt();

            int ketQua = soThuNhat + soThuHai;
            System.out.println("Kết quả: " + soThuNhat + " + " + soThuHai + " = " + ketQua);

        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ!");

        } finally {
            System.out.println("Chương trình đã kết thúc.");
            scanner.close();
        }
    }
}
