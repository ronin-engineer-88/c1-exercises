package _05_Arrays;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) max = num;
            }
        }

        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}

/*
Nhập mảng 2 chiều từ bàn phím.
Duyệt toàn bộ mảng để tìm giá trị lớn nhất.
*/
