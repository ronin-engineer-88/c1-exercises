package _03_Operators_Conditions;

import java.util.Scanner;

public class HW06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();
        scanner.close();

        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/*
Điều kiện tam giác:
  Ba số a, b, c có thể là 3 cạnh của một tam giác nếu và chỉ nếu:
  => a + b > c và a + c > b và b + c > a
* */