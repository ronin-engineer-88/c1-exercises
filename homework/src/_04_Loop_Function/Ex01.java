package _04_Loop_Function;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0;
        int sum = 0;
        int count = 0;  // Số lượng giá trị (không tính 0)

        System.out.println("Nhập các số nguyên (nhập 0 để dừng):");
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break; // Dừng khi đến số 0
            }
            if (number > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
            sum += number;
            count++;
        }
        scanner.close();

        double average = (count != 0) ? (double) sum / count : 0;
        System.out.println("Số dương: " + positiveCount);
        System.out.println("Số âm: " + negativeCount);
        System.out.println("Tổng: " + sum);
        System.out.println("Trung bình: " + average);
    }
}
/*
    Dùng vòng lặp while để đọc số từ bàn phím.
    Nếu số nhập là 0 thì dừng vòng lặp.
    Đếm số dương,số âm,cộng dồn tổng và đếm số giá trị.
    Tính trung bình sau khi thoát vòng lặp
*/