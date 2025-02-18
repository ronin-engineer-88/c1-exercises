package _04_Loop_Function;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        String num = scanner.next();

        boolean increasing = true, decreasing = true;

        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) > num.charAt(i - 1)) decreasing = false;
            if (num.charAt(i) < num.charAt(i - 1)) increasing = false;
        }

        System.out.println((increasing || decreasing) ? "YES" : "NO");
        scanner.close();
    }
}
/*
    1.Duyệt từng chữ số từ trái qua phải.
    2.Kiểm tra có tăng hoặc giảm dần hay không.
    3.Nếu thỏa mãn một trong hai điều kiện trên thì in YES, ngược lại NO.
*/
