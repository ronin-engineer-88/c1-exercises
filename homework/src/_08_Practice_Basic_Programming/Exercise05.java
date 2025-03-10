package _08_Practice_Basic_Programming;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        BigInteger base = BigInteger.valueOf(5);
        int exponent = 12;
        System.out.printf("%d^%d %% 2752 = %d\n", base, exponent, power(base, exponent).mod(BigInteger.valueOf(2752)));
    }

    public static BigInteger power(BigInteger base, int exponent) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < exponent; i++) {
            result = result.multiply(base);
        }
        return result;
    }


    /*
        - Viết chương trình tính (5^12) % 2752
        - Input: Số 5 và 12
        - Output: Là kết quả của phép tính (5^12) % 2752
    */
}
