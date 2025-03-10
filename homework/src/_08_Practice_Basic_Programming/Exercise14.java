package _08_Practice_Basic_Programming;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên N: ");
        int N = input.nextInt();
        System.out.printf("Số lượng các ước số của N chia hết cho 3 là: %d", numberDivisor(N));
    }

    public static int numberDivisor(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && i % 3 == 0)
                count++;
        }

        return count;
    }

    /*
        - Cho số nguyên dương N. Nhiệm vụ của bạn là hãy xác định xem có bao nhiêu ước số của N chia hết cho 3.
        - Input: N = 972
        - Output: Số lượng các ước số của n chia hết cho 3
    */
}
