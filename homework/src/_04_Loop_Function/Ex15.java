package _04_Loop_Function;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        // Tìm GCD
        int gcd = 1;
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }

        // Tìm LCM
        int lcm = Math.max(a, b);
        while (lcm % a != 0 || lcm % b != 0) {
            lcm++;
        }

        System.out.println("Ước số chung lớn nhất: " + gcd);
        System.out.println("Bội số chung nhỏ nhất: " + lcm);

        scanner.close();
    }
}
/*
*  Ước số chung lớn nhất (GCD) và Bội số chung nhỏ nhất (LCM)
1. GCD: Duyệt từ min(a, b) về 1, số nào chia hết cả a và b thì là GCD.
2. LCM: Duyệt từ max(a, b) trở lên, số nào chia hết cả a và b thì là LCM.*/
