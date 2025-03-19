package _12_Exception;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập tuổi của bạn: ");
            int tuoi = scanner.nextInt();

            if (tuoi < 6) {
                throw new InvalidAgeException("Tuổi không hợp lệ! Tuổi phải lớn hơn hoặc bằng 6.");
            }

            System.out.println("Tuổi của bạn là: " + tuoi);
        } catch (InvalidAgeException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ!");
        } finally {
            scanner.close();
            System.out.println("Chương trình đã kết thúc.");
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
