package _08_Practice_Basic_Programming;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi muốn kiểm tra: ");
        String a = input.nextLine();

        if (isPalindrome(a)) {
            System.out.printf("%s là chuỗi đối xứng.\n", a);
            System.out.printf("Ký tự thứ thứ 32 của chuỗi là %c", a.charAt(32+1));
        } else {
            System.out.printf("%s không phải là chuỗi đối xứng.\n", a);
            System.out.printf("Ký tự thứ thứ 26 của chuỗi là %c", a.charAt(26+1));
        }

    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    /*
        - Viết chương trình kiểm tra chuỗi
          ecoceoaaeceoaaeoceooceaoeoceooceoaaoeceoaecoea có phải là một xâu đối xứng không
        - Input: Một xâu ký tự như trên
        - Output: Nếu xâu trên là xâu đối xứng hãy in ra ký tự thứ 32 trong chuỗi,
          nếu không hãy in ra ký tự thứ 26 trong chuỗi. Vị trí đầu được gọi là ký tự thứ 1.
    */
}
