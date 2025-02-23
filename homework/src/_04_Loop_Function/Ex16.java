package _04_Loop_Function;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên dương (tối đa 9 chữ số): ");
        int number = scanner.nextInt();

        if (isValid(number)) {
            if (checkNumberFirstAndLastDigit(number)) {
                System.out.println("Số " + number + " có chữ số đầu và cuối giống nhau.");
            } else {
                System.out.println("Số " + number + " có chữ số đầu và cuối khác nhau.");
            }
        } else {
            System.out.println("Số không hợp lệ! Vui lòng nhập số có từ 2 đến 9 chữ số.");
        }
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 999_999_999;
    }

    public static boolean checkNumberFirstAndLastDigit(int number) {
        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;

        return lastDigit == firstDigit;
    }

    /*
        - Nhập vào một số nguyên dương từ bàn phím.
        - Kiểm tra số có từ 2 đến 9 chữ số hay không.
        - Lấy chữ số cuối bằng cách lấy phần dư của số chia cho 10.
        - Lấy chữ số đầu bằng cách lặp chia số cho 10 đến khi chỉ còn một chữ số.
        - So sánh hai chữ số và in ra kết quả.
    */
}

