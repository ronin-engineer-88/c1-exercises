package _08_Practice_Basic_Programming;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String s = input.nextLine();

        String reverseString = reverse(s);
        System.out.printf("Chuỗi đảo ngược là: %s\n",reverseString);
        System.out.printf("Ký tự thứ 39 của chuỗi đảo ngược là: %c\n",reverseString.charAt(39));
    }

    public static String reverse (String str) {
        StringBuilder reverseString = new StringBuilder();

        for (int i = str.length() - 1; i >=0; i--) {
            reverseString.append(str.charAt(i));
        }

        return reverseString.toString();
    }

    /*
        - Viết chương trình đảo ngược string a. Ví dụ "abc" -> "cba".
        - Input: Nhập vào xâu
          a = "o1YL9F6TIEHt2kqnIB6ZD8mcx6Qk6cCs31miF1kbCsiiP71kfmbbkThJXFYDElVZfESZWqgyCxk3GozgdtxOglgoEfmt60xGAHbt".
        - Output: In ra ký tự của vị trí index = 39 của string a sau khi đảo ngược.
    */
}
