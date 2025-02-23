package _04_Loop_Function;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bạn mong muốn: ");
        String s = scanner.nextLine();

        findMostFrequentChar(s);

    }

    public static void findMostFrequentChar(String str) {
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            int countChar = countChar(str, str.charAt(i));
            if (countChar > maxCount)
                maxCount = countChar;
        }

        System.out.print("Ký tự hiển thị nhiều nhất trong chuỗi là: ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(countChar(str, c) == maxCount && str.indexOf(c) == i) {
                System.out.print(c + " ");
            }
        }
    }

    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    /*
        - Nhập vào một chuỗi từ bàn phím.
        - Duyệt qua từng ký tự trong chuỗi để tìm số lần xuất hiện lớn nhất.
        - Duyệt lại chuỗi một lần nữa để in ra các ký tự có số lần xuất hiện nhiều nhất.
        - Kiểm tra vị trí đầu tiên của ký tự (`str.indexOf(c) == i`) để tránh in trùng lặp.
        - Sử dụng một hàm `countChar()` để đếm số lần xuất hiện của từng ký tự.
    */
}

