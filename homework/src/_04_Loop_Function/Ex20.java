package _04_Loop_Function;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương N: ");
        int N = scanner.nextInt();

        System.out.printf("Số lượng ước số của %d chia hết cho 2 là: %d", N, countEvenDivisors(N));
    }

    public static int countEvenDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

/*
    - Nhập vào số nguyên dương N.
    - Duyệt từ 1 đến N để tìm các ước số của N.
    - Nếu một ước số chia hết cho 2 thì tăng biến đếm.
    - In ra kết quả là số lượng ước số của N chia hết cho 2.
*/
