package _05_Arrays;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào độ dài của mảng: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập vào giá trị thứ " + (i + 1) + " của mảng: ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();

        System.out.print("Index của số nguyên " + n + " trong mảng là: ");
                findIndex(arr, n);
    }

    public static void findIndex(int[] arr, int n) {

        int[] indexs = new int[arr.length];
        int numberIndexs = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                indexs[numberIndexs] = i;
                numberIndexs++;
            }
        }

        if (numberIndexs == 0)
            System.out.print(-1);
        else {
            for (int i = 0; i < numberIndexs; i++) {
                System.out.print(indexs[i]);
                if(i < numberIndexs-1)
                    System.out.print(", ");
            }
            System.out.println();
        }
    }

    /*
        Cách giải bài tập:
        - Nhập độ dài mảng và các phần tử từ bàn phím.
        - Nhập số nguyên n cần tìm.
        - Duyệt qua mảng để tìm số n, lưu các index tìm được vào mảng indexs.
        - Nếu tìm thấy, in tất cả index ngăn cách bằng dấu ", ".
        - Nếu không tìm thấy, in -1.
    */
}
