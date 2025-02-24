package _05_Arrays;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào kích thước của mảng: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập vào giá trị thứ " + (i + 1) + " của mảng: ");
            arr[i] = scanner.nextInt();
        }

        if(isPalindromeArray(arr))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean isPalindromeArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    /*
        Cách giải bài tập:
        - Nhập vào kích thước của mảng và các phần tử từ người dùng.
        - Gọi hàm `isPalindromeArray()` để kiểm tra mảng có đối xứng không.
        - Trong hàm `isPalindromeArray()`:
            + Duyệt qua nửa đầu của mảng.
            + So sánh phần tử ở vị trí `i` với phần tử đối diện của nó `arr.length - 1 - i`.
            + Nếu có cặp phần tử nào không khớp, trả về `false` (mảng không đối xứng).
            + Nếu tất cả phần tử đều khớp, trả về `true` (mảng đối xứng).
        - Nếu mảng đối xứng, in "YES", ngược lại in "NO".
    */

}
