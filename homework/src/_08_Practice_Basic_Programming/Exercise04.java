package _08_Practice_Basic_Programming;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = input.nextInt();

        System.out.printf("%d! = %d\n", n, factorial(n));
        System.out.printf("%d! %% 2752 = %d\n", n, factorial(n).mod(BigInteger.valueOf(2752)));
    }

    public static BigInteger factorial(int n) {
        if (n == 0) return BigInteger.ONE;
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            fact = fact.multiply(BigInteger.valueOf(i));

        return fact;
    }

    /*
        - Viết chương trình tính 20! % 2752
        - Input: Số 20
        - Output: Là kết quả của phép tính 20! % 2752
    */
}
