package _02_Variable_Data_Type;

import java.util.Scanner;

public class Console05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên của bạn: " );
        String fullname = scanner.nextLine();

        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập chiều cao của bạn (mét): ");
        String high = scanner.nextLine();

        System.out.printf(
                "\u2022 Họ và tên: %s\n" +
                "\u2022 Tuổi: %d\n" +
                "\u2022 Chiều cao: %sm\n",
                fullname, age, high
        );
    }
}
