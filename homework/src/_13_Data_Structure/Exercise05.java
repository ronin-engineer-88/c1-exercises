package _13_Data_Structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> numberQueue = new LinkedList<>();

        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        System.out.println("Nhập các số:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numberQueue.add(number);  // Thêm phần tử vào cuối queue
        }

        System.out.println("Các số theo thứ tự đã nhập:");
        while (!numberQueue.isEmpty()) {
            System.out.print(numberQueue.poll() + " ");  // Lấy và xóa phần tử đầu tiên
        }

        scanner.close();
    }
}
