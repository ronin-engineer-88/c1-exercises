package _07_Recursion_Searching_Algorithms;

import java.util.Scanner;

public class Ex04 {
    public static int sum(int n) {
        if (n == 1) return 1; // Điều kiện dừng
        return n + sum(n - 1); // Công thức đệ quy
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n (0 < n < 1000): ");
        int n = sc.nextInt();

        if (n <= 0 || n >= 1000) {
            System.out.println("n phải nằm trong khoảng 1 đến 999.");
        } else {
            System.out.println("Tổng: " + sum(n));
        }

        sc.close();
    }
}

/* Tính tổng 1 + 2 + 3 + … + n (0 < n < 1000) theo giải thuật đệ quy */

/*
*  Ý tưởng
  1. Gọi sum(n) là tổng từ 1 đến n, ta có công thức:
        sum(n)=n+sum(n−1)
  2. Điều kiện dừng: Khi n == 1, trả về 1 vì tổng của chỉ một phần tử 1 là chính nó.
*/
