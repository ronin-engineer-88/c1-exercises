package _04_Loop_Function;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhập vào số n: "); int n = scanner.nextInt();

        System.out.printf("Số fibonacci thứ %d là: %d\n", n, fib(n));
    }

    public static int fib(int n) {
        if(n == 1 || n == 2)
            return 1;
        return fib(n-1) + fib(n-2);
    }

    /*
        Nhập vào số n.
        Tính số Fibonacci thứ n bằng công thức truy hồi.
        - Nếu n == 1 hoặc n == 2, trả về 1.
        - Nếu n > 2, gọi đệ quy để tính fib(n-1) + fib(n-2).
        In kết quả ra màn hình.
    */

}
