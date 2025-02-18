package _04_Loop_Function;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n (n > 0): ");
        int n = scanner.nextInt();
        scanner.close();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Giai thừa của " + n + " là: " + factorial);
    }
}

/*
      1. Dùng vòng lặp for từ 1 đến n, nhân dồn kết quả.
      2. In ra giai thừa của số n.
*/
