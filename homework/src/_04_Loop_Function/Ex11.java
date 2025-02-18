package _04_Loop_Function;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n (n > 0): ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Các số chính phương nhỏ hơn " + n + " là:");
        int i = 1;
        while (i * i < n) {
            System.out.print(i * i + " ");
            i++;
        }
        System.out.println();
    }
}
/*
    1. Dùng vòng lặp while tăng dần i.
    2. Kiểm tra điều kiện i*i < n để in ra các số chính phương.
    3. In danh sách các số chính phương nhỏ hơn n.
*/
