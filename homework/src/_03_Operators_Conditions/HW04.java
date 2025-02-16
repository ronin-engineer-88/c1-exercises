package _03_Operators_Conditions;

import java.util.Scanner;

public class HW04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();
        scanner.close();

        if (a > b) {
            System.out.println("Số " + a + " lớn hơn số " + b);
        } else if (a < b) {
            System.out.println("Số " + b + " lớn hơn số " + a);
        } else {
            System.out.println("Hai số bằng nhau.");
        }
    }
}

  /*
    Nếu a > b, thì a lớn hơn b.
    Nếu a < b, thì b lớn hơn a.
    Nếu a == b, thì hai số bằng nhau.
  */