package _08_Practice_Basic_Programming;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập vào số k: ");
        int k = input.nextInt();

        System.out.printf("Số nhỏ nhất có tổng các chữ số bằng %d là: %d", k, findSmallest(k));

    }

    public static int findSmallest(int k) {
        if (k <= 9 && k>= 0)
            return k;

        int start = 10;
        while (true) {
            int sum = 0;
            int n  = start;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum == k) break;
            else start++;
        }

        return start;
    }

    /*
        - Tìm một số nhỏ nhất có tổng các chữ số bằng k.
        - Ví dụ: k = 10, có 19 là số nhỏ nhất có tổng bằng 10 (1 + 9).
        - Input: Nhập vào k = 30.
        - Output: In ra kết quả số nhỏ nhất có tổng các chữ số bằng 30.
    */
}
