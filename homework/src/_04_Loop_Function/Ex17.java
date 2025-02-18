package _04_Loop_Function;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.print(n + " = ");

        for (int i = 2; i <= n; i++) {
            int count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count > 0) {
                System.out.print(i + "^" + count);
                if (n > 1) System.out.print(" x ");
            }
        }
    }
}
/*
Bắt đầu từ i = 2, kiểm tra xem n có chia hết cho i không.
Nếu có, chia cho i đến khi không chia được nữa.
Ghi lại số lần chia hết (count).
Nếu còn phần dư (n > 1), tiếp tục với số nguyên tố tiếp theo.
Khi n == 1, kết thúc chương trình
*/
