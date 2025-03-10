package _08_Practice_Basic_Programming;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số k: ");
        int k = input.nextInt();

        System.out.printf("Số n lớn nhất thỏa mãn n^5 > %d là: %d", k, findNumber(k));
    }

    public static int findNumber(int k) {

        int n = 0;
        while (true) {
            BigInteger result = power(BigInteger.valueOf(n), 5);
            if (result.compareTo(BigInteger.valueOf(k)) > 0)
                break;
            else
                n++;
        }

        return n-1;
    }

    public static BigInteger power(BigInteger base, int exponent) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < exponent; i++) {
            result = result.multiply(base);
        }
        return result;
    }

    /*
      - Tìm số nguyên n lớn nhất thỏa mãn n^5 < k
      - Input: k = 10947264
      - Output: In ra giá trị n tìm được
    */
}
