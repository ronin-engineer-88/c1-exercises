package _13_Datastructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Queue<Integer> numberQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập dãy số
        System.out.println("Nhập dãy số (nhập -1 để kết thúc):");
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break; // Thoát khi nhập -1
            }
            numberQueue.add(number); // Thêm số vào queue
        }

        // In ra dãy số theo thứ tự nhập vào
        System.out.println("Dãy số trong queue:");
        while (!numberQueue.isEmpty()) {
            System.out.print(numberQueue.poll() + " "); // Lấy và xóa phần tử đầu tiên
        }
        System.out.println();

        scanner.close();
    }
}
