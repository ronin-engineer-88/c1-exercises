package _04_Loop_Function;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        int max = Integer.MIN_VALUE, count = 0;
        System.out.println("Nhập các số:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
                count = 1;
            } else if (num == max) {
                count++;
            }
        }

        System.out.println("Số lớn nhất: " + max);
        System.out.println("Số lần xuất hiện: " + count);
        scanner.close();
    }
}
/*
    1. Nhập n số nguyên.
    2. Duyệt từng số, cập nhật giá trị lớn nhất.
    3. Đếm số lần xuất hiện của số lớn nhất.
    4. In kết quả.
*/
