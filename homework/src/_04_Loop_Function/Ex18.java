package _04_Loop_Function;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phép toán (dạng a+b=c): ");
        String input = scanner.nextLine();

        if (isValid(input)) {
            int a = input.charAt(0) - '0';
            int b = input.charAt(2) - '0';
            int c = input.charAt(4) - '0';

            if (a + b == c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("Định dạng không hợp lệ!");
        }
    }

    public static boolean isValid(String str) {
        return str.length() == 5 &&
                Character.isDigit(str.charAt(0)) &&
                str.charAt(1) == '+' &&
                Character.isDigit(str.charAt(2)) &&
                str.charAt(3) == '=' &&
                Character.isDigit(str.charAt(4));
    }

    /*
        - Nhập vào một chuỗi có định dạng "a+b=c".
        - Kiểm tra xem chuỗi có đúng định dạng hay không (chỉ gồm số và ký tự '+', '=').
        - Trích xuất các số a, b, c từ chuỗi.
        - Tính tổng a + b và so sánh với c.
        - Nếu bằng nhau, in ra "YES", ngược lại in "NO".
    */
}

