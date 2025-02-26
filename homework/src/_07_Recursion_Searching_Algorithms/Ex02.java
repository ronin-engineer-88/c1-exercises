package _07_Recursion_Searching_Algorithms;

import java.util.Scanner;

public class Ex02 {
    public static int binarySearch(int[] A, int X) {
        int left = 0, right = A.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Tránh tràn số khi tính (left + right) / 2

            if (A[mid] == X) return 1;   // Tìm thấy X
            if (A[mid] < X) left = mid + 1;  // Tìm ở nửa phải
            else right = mid - 1;  // Tìm ở nửa trái
        }

        return -1; // Không tìm thấy
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử n: ");
        int n = sc.nextInt();
        int[] A = new int[n];

        System.out.println("Nhập các phần tử đã sắp xếp:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Nhập số X cần tìm: ");
        int X = sc.nextInt();

        System.out.println(binarySearch(A, X));

        sc.close();
    }
}

  /*  Cho mảng A[] gồm n phần tử đã được sắp xếp. Hãy đưa ra 1 nếu X có mặt trong mảng A[], ngược lại đưa ra -1. */

/*
* Ý tưởng
1. Sử dụng Binary Search để tìm X trong mảng A[]:
    - Lấy mid = (left + right) / 2.
    - Nếu A[mid] == X → Trả về 1 (tìm thấy).
    - Nếu A[mid] < X → Tìm trong nửa phải (left = mid + 1).
    - Nếu A[mid] > X → Tìm trong nửa trái (right = mid - 1).
2. Nếu duyệt hết mà không tìm thấy X → Trả về -1.
* */
