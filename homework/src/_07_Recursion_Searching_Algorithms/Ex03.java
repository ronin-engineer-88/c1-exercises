package _07_Recursion_Searching_Algorithms;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập x: ");
        int x = scanner.nextInt();

        System.out.print("Nhập số mũ n: ");
        int n = scanner.nextInt();
        while (n < 0 || n > 21) {
            System.out.print("Số mũ vui lòng trong khoảng [0,20]. Hãy nhập lại: ");
            n = scanner.nextInt();
        }

        System.out.println(power(x, n));
    }

    public static double power(double x, int n) {
        if (n == 0) return 1.0;
        if (n == 1) return x;

        return x * power(x, n-1);
    }

    /* Cách làm:
        - Xây dựng hàm đệ quy `power(x, n)` để tính lũy thừa của x mũ n.
        - Nếu n = 0, trả về 1 (quy ước bất kỳ số nào mũ 0 đều bằng 1).
        - Nếu n = 1, trả về chính x.
        - Nếu n > 1, tính kết quả bằng cách nhân x với power(x, n - 1) (tính lũy thừa bằng đệ quy).
    */
}
