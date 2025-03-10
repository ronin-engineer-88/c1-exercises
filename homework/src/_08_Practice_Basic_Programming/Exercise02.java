package _08_Practice_Basic_Programming;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = input.nextInt();

        System.out.printf(
                "Số fibonacci thứ %d là %d\n",
                n,
                fibonacci(n));
    }

    public static long fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;

    }

    /*
        - Viết chương trình tìm số Fibonacci thứ 50.
        - Input: Một số nguyên n = 5
        - Output: Một số nguyên là số Fibonacci thứ 50
    */

}
