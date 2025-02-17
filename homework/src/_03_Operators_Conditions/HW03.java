package _03_Operators_Conditions;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: "); int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: "); int b = scanner.nextInt();

        // Tính tổng của a và b
        int sum = a + b;
        System.out.printf("a + b = %d\n", sum);

        // Tính hiệu của a và b
        int diff = a - b;
        System.out.printf("a - b = %d\n", diff);

        // Tích của a và b
        int product = a * b;
        System.out.printf("a * b = %d\n", product);

        // Thương của a và b
        if(b == 0)
            System.out.println("Lỗi");
        else {
            double quotient = (double) a / b;
            System.out.printf("a/b = %.2f\n", quotient);
        }

    }
}
