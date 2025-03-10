package _08_Practice_Basic_Programming;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = input.nextInt();

        System.out.printf("Số nguyên tố thứ %d là: %d", n, findPrimenth(n));

    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int findPrimenth(int n) {
        int count = 1;
        int start = 3;

        while (count < n) {
            if (isPrime(start))
                count++;

            if (count == n) break;
            else start += 2;
        }

        return start;
    }

    /*
        - Viết chương trình tìm số nguyên tố thứ 500.
        - Input: Một số nguyên n = 500
        - Output: Một số nguyên là số nguyên tố thứ 500
    */
}
